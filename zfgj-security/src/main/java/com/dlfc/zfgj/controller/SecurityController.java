package com.dlfc.zfgj.controller;

import com.dlfc.zfgj.dto.base.ResultDTO;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walden on 2017/2/20.
 */
@RestController
@RequestMapping("/w/securities")
public class SecurityController {

    @RequestMapping(value = "logout", method = RequestMethod.PUT)
    public ResultDTO<Void> logout(){
        SecurityUtils.getSubject().logout();

        return ResultDTO.success();
    }
}
