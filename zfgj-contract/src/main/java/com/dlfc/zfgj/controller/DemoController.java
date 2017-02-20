package com.dlfc.zfgj.controller;

import com.dlfc.zfgj.model.User;
import com.dlfc.zfgj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walden on 2017/2/15.
 */
@RestController
@RequestMapping(value = "/w/demos")
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public User user(){
        return userService.getUserNew();
    }
}
