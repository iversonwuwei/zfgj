package com.dlfc.zfgj.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by walden on 2017/2/16.
 */
@Getter
@Setter
@Component
public class HouseUserDTO {

    private String contractId;

    /**
     * 房屋使用人姓名
     */
    @NotNull
    @NotBlank
    private String houseUserName;

    /**
     * 证件类型
     */
    @NotNull
    @NotEmpty
    private List<String> identityMode;

    /**
     * 证件号码
     */
    @NotNull
    @NotBlank
    private String idNumber;

    /**
     * 电话号码
     */
    @NotBlank
    @NotNull
    private String phoneNumber;
}
