package com.dlfc.zfgj.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by walden on 2017/2/15.
 */
@Getter
@Setter
@Component
public class ContractDTO {

    /**
     * 合同编号
     */
    private String contractId;

    /**
     * 签约步骤
     */
    private Integer step;

    /**
     * 创建日期
     */
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdDate;

    /**
     * 地址
     */
    private String address;

    /**
     * 我也不知道怎么命名
     */
    private String editString;

    /**
     * 房租
     */
    private float feeOfMonth;

    /**
     * 合同生效日期
     */
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startDate;

    /**
     * 合同结束日期
     */
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endDate;

    /**
     * 押金
     */
    private float deposit;

    /**
     * 合同状态
     */
    private String contractStatus;

}
