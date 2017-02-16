package com.dlfc.zfgj.dto;

import com.dlfc.zfgj.enums.Settlement;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

/**
 * Created by walden on 2017/2/16.
 */
@Getter
@Setter
@Component
public class ContractStep3DTO extends ContractStep2DTO {

    /**
     * 租金
     */
    private double rent;

    /**
     * 结算周期 月，季度，半年，年
     */
    @Enumerated(value = EnumType.STRING)
    private Settlement settlement = Settlement.MONTH;

    /**
     * 房主承担
     */
    private List<String> ownerResponsibility;

    /**
     * 代理费
     */
    private double agentFee;

    /**
     * 押金
     */
    private double deposit;
}
