package com.dlfc.zfgj.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by walden on 2017/2/16.
 */
@Getter
@Setter
@Component
public class OtherRelatedItemDTO {

    private String contractid;

    /**
     * 项目
     */
    private String item;

    /**
     * 单位
     */
    private String unit;

    /**
     * 单价
     */
    private String price;

    /**
     * 起始时间
     */
    private Date startDate;

    /**
     * 最小数量
     */
    private String minQuantity;
}
