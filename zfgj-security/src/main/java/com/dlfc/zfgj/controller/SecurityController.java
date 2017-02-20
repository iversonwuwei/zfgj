package com.dlfc.zfgj.controller;

import com.dlfc.zfgj.dto.LoginDTO;
import com.dlfc.zfgj.dto.base.ResultDTO;
import com.dlfc.zfgj.exception.CustomRuntimeException;
import com.dlfc.zfgj.model.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by walden on 2017/2/20.
 */
@Slf4j
@RestController
@RequestMapping("/w/securities")
public class SecurityController {


    @RequestMapping(value = "logout", method = RequestMethod.PUT)
    public ResultDTO<Void> logout(){
        SecurityUtils.getSubject().logout();

        return ResultDTO.success();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultDTO<LoginDTO> login(@RequestBody @Valid User user) throws CustomRuntimeException {
        String username = user.getUsername();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        //获取当前的Subject
        Subject currentUser = SecurityUtils.getSubject();

        try{
            currentUser.login(token);
        }catch(UnknownAccountException uae){
            SecurityController.log.info("对用户[" + username + "]进行登录验证..验证未通过,未知账户");
            throw new CustomRuntimeException("message", "未知账户");
        }catch(IncorrectCredentialsException ice){
            SecurityController.log.info("对用户[" + username + "]进行登录验证..验证未通过,错误的凭证");
            throw new CustomRuntimeException("message", "密码不正确");
        }catch(LockedAccountException lae){
            SecurityController.log.info("对用户[" + username + "]进行登录验证..验证未通过,账户已锁定");
            throw new CustomRuntimeException("message", "账户已锁定");
        }catch(ExcessiveAttemptsException eae){
            SecurityController.log.info("对用户[" + username + "]进行登录验证..验证未通过,错误次数过多");
            throw new CustomRuntimeException("message", "用户名或密码错误次数过多");
        }catch(AuthenticationException ae){
            //通过处理Shiro的运行时AuthenticationException就可以控制用户登录失败或密码错误时的情景
            SecurityController.log.info("对用户[" + username + "]进行登录验证..验证未通过,堆栈轨迹如下");
            throw new CustomRuntimeException("message", "用户名或密码不正确");
        }
        if (!currentUser.isAuthenticated()){
            token.clear();
            throw new CustomRuntimeException("","");
        }
        //TODO 返回DTO
        return null;
    }
}
