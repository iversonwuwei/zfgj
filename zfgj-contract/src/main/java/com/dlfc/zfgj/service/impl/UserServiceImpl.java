package com.dlfc.zfgj.service.impl;

import com.dlfc.zfgj.entity.UsrUser;
import com.dlfc.zfgj.entity.UsrUserExample;
import com.dlfc.zfgj.mapper.UsrUserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by walden on 2017/2/22.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UsrUserMapper usrUserMapper;
    @Autowired
    private UsrUserExample usrUserExample;

    @Override
    public UsrUser findOne(String username) {
        UsrUserExample.Criteria criteria = usrUserExample.or();
        criteria.andUsernameEqualTo(username);
        List<UsrUser> usrUsers = usrUserMapper.selectByExample(usrUserExample);
        return null;
    }
}
