package com.dlfc.zfgj.dto;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by walden on 2017/2/16.
 */
@Component
public class HouseUserDTO {

    private String contractId;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getHouseUserName() {
        return houseUserName;
    }

    public void setHouseUserName(String houseUserName) {
        this.houseUserName = houseUserName;
    }

    public List<String> getIdentityMode() {
        return identityMode;
    }

    public void setIdentityMode(List<String> identityMode) {
        this.identityMode = identityMode;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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
