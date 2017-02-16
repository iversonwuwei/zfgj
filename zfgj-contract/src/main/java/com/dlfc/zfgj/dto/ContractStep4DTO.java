package com.dlfc.zfgj.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by walden on 2017/2/16.
 */
@Getter
@Setter
@Component
public class ContractStep4DTO extends ContractStep3DTO {

    private List<String> lessorPapers;

    private List<String> tenantryPaper;

    private String others;

    private List<String> deliverItemIds;

    private List<String> otherRelatedIds;
}
