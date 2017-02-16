package com.dlfc.zfgj.repositories;

import com.dlfc.zfgj.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by walden on 2017/2/15.
 */
@Mapper
@Repository
public interface UserRepository {

    @Select("select username, password from user")
    List<User> getUsers();
}
