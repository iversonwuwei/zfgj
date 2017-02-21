package com.dlfc.zfgj.controller;

import com.dlfc.zfgj.convertor.UserConvertor;
import com.dlfc.zfgj.dto.UserDTO;
import com.dlfc.zfgj.dto.base.ListResultDTO;
import com.dlfc.zfgj.exception.CustomRuntimeException;
import com.dlfc.zfgj.model.HouhouseInfo;
import com.dlfc.zfgj.model.User;
import com.dlfc.zfgj.repositories.HouhouseInfoMapper;
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
    private UserConvertor userConvertor;

    @Autowired
    private HouhouseInfoMapper houhouseInfoMapper;

    @RequestMapping(method = RequestMethod.GET)
    public ListResultDTO<UserDTO> user() throws CustomRuntimeException {
        List<User> users = userService.getUsers();
        return userConvertor.toResultDTO(users);
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public List<HouhouseInfo> get(){
        return houhouseInfoMapper.getHouhouseInfos();
    }
}
