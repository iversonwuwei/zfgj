package com.dlfc.zfgj.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * Created by walden on 2017/2/16.
 */
@Getter
@Setter
@Component
public class ContractStep1DTO {

    /**
     * 合同编号
     */
    private String contractId;

    private Integer step;

    /**
     * 出租人姓名
     */
    @NotNull
    @NotBlank
    private String lessorName;

    /**
     * 出租人身份证号码
     */
    @NotBlank
    @NotNull
    private String lessorId;

    /**
     * 出租人电话号码
     */
    @NotBlank
    @NotNull
    private String lessorPhoneNumber;

    /**
     * 出租人送达地址
     */
    private String lessorDeliverAddress;

    /**
     * 出租人邮件地址
     */
    @Email
    private String lessorEmail;

    /**
     * 出租人-联系人姓名
     */
    private String lessorContactName;

    /**
     * 出租人联系号码
     */
    private String lessorContactPhoneNumber;

    /**
     * 承租人姓名
     */
    @NotNull
    @NotBlank
    private String tenantryName;

    /**
     * 承租人身份证号码
     */
    @NotBlank
    @NotNull
    private String tenantryId;

    /**
     * 承租人电话号码
     */
    @NotBlank
    @NotNull
    private String tenantryPhoneNumber;

    /**
     * 承租人送达地址
     */
    private String tenantryDeliverAddress;

    /**
     * 承租人邮件地址
     */
    @Email
    private String tenantryEmail;

    /**
     * 承租人-联系人姓名
     */
    private String tenantryContactName;

    /**
     * 承租人联系号码
     */
    private String tenantryContactPhoneNumber;
}
