package com.dlfc.zfgj.dto;

import com.dlfc.zfgj.enums.LeaseUse;
import com.dlfc.zfgj.enums.RentalMode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by walden on 2017/2/16.
 */
@Getter
@Setter
@Component
public class ContractStep2DTO extends ContractStep1DTO {

    /**
     * 房源信息
     */
    @NotBlank
    @NotNull
    private String houseResourceId;

    /**
     * 租赁期限
     */
    private Integer months;

    /**
     * 租赁起始日期
     */
    private Date contractStartDate;

    /**
     * 租赁方式
     */
    private RentalMode rentalMode = RentalMode.WHOLE;

    /**
     * 租赁用途
     */
    private LeaseUse leaseUse = LeaseUse.PERSONAL;

    /**
     * 使用人数
     */
    private Integer userQuantity;
}
