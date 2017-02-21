package com.dlfc.zfgj.service;

import com.dlfc.zfgj.model.User;
import com.dlfc.zfgj.model.UserExample;
import com.dlfc.zfgj.repositories.UserMapper;
import com.dlfc.zfgj.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by walden on 2017/2/15.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserExample userExample;


    public List<User> getUsers(){
        userExample.setDistinct(true);
        return userMapper.selectByExample(userExample);
    }
}
