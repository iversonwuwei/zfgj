package com.dlfc.zfgj.convertor;

import com.dlfc.zfgj.dto.ContractDTO;
import com.dlfc.zfgj.exception.CustomRuntimeException;
import com.dlfc.zfgj.model.Contract;
import com.dlfc.zfgj.repositories.ContractMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 2017/2/16.
 */
@Component
public class ContractConvertor extends AbstractConvertor<Contract, ContractDTO> {

    @Autowired
    private ContractMapper contractMapper;


    @Override
    public Contract toModel(ContractDTO contractDTO) throws CustomRuntimeException {

        Contract contract = contractMapper.selectById(contractDTO.getContractId());
        if (contract == null){
            contract = new Contract();
        }
        //TODO

        int success = contractMapper.insertSelective(contract);
        if (success == 1){
            contract = contractMapper.selectById(contractDTO.getContractId());
        }else{
            throw new CustomRuntimeException("","");
        }
        return contract;
    }

    @Override
    public ContractDTO toDTO(Contract model, boolean forListView) {
        ContractDTO contractDTO = new ContractDTO();
        contractDTO.setContractId(model.getId());
        contractDTO.setAddress(model.getHouseAddr());
        contractDTO.setContractStatus(model.getStatus());
        contractDTO.setCreatedDate(model.getCreateTime());
        contractDTO.setDeposit(model.getDepositAmt());
        contractDTO.setEditString(model.getHid());
        contractDTO.setEndDate(model.getEndTime());
        contractDTO.setFeeOfMonth(model.getLeaseTermMonth());
        contractDTO.setStartDate(model.getStartTime());
        contractDTO.setStep(1);

        return contractDTO;
    }
}
