package com.dlfc.zfgj.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 2017/2/16.
 */
@Getter
@Setter
@Component
public class DeliverItemDTO {

    private String contractId;

    /**
     * 名称
     */
    private String name;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 价格
     */
    private double price;

    /**
     * 赔偿金额
     */
    private double compensation;
}
