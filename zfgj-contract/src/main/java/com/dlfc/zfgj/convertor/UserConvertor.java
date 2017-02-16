package com.dlfc.zfgj.convertor;

import com.dlfc.zfgj.dto.UserDTO;
import com.dlfc.zfgj.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 2017/2/9.
 */
@Component
public class UserConvertor extends AbstractConvertor<User, UserDTO> {


    @Override
    public User toModel(UserDTO userDTO) {


        return null;
    }

    @Override
    public UserDTO toDTO(User model, boolean forListView) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(model.getUsername());
        return userDTO;
    }
}
