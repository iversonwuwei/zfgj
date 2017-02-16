package com.dlfc.zfgj.controller;

import com.dlfc.zfgj.model.User;
import com.dlfc.zfgj.model.UserExample;
import com.dlfc.zfgj.repositories.UserMapper;
import com.dlfc.zfgj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by walden on 2017/2/15.
 */
@RestController
@RequestMapping(value = "/w/demos")
public class DemoController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserExample userExample;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> user(){
        return userMapper.selectByExample(userExample);
    }
}
