package com.dlfc.zfgj.convertor;

import com.dlfc.admin.common.utils.IdGen;
import com.dlfc.zfgj.convertor.base.AbstractConvertor;
import com.dlfc.zfgj.dto.ContractDTO;
import com.dlfc.zfgj.entity.ConContract;
import com.dlfc.zfgj.exception.CustomRuntimeException;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 2017/2/22.
 */
@Component
public class ContractConvertor extends AbstractConvertor<ConContract, ContractDTO> {
    @Override
    public ConContract toModel(ContractDTO contractDTO) {
        ConContract conContract = new ConContract();
        conContract.setId(IdGen.uuid());

        return null;
    }

    @Override
    public ContractDTO toDTO(ConContract model, boolean forListView) {

        ContractDTO contractDTO = new ContractDTO();
        if (model == null){
            try {
                throw new CustomRuntimeException("", "");
            } catch (CustomRuntimeException e) {
                e.printStackTrace();
            }
        }
        contractDTO.setStartDate(model.getStartTime());
        contractDTO.setEndDate(model.getEndTime());
        contractDTO.setEditString(model.getCycle());
        contractDTO.setCreatedDate(model.getCreateTime());
        contractDTO.setAddress(model.getHouseAddr());
        contractDTO.setContractId(model.getId());
        contractDTO.setContractStatus(model.getStatus());
        contractDTO.setDeposit(model.getDepositAmt());
        contractDTO.setFeeOfMonth(model.getLeaseTermMonth());
        return contractDTO;
    }
}
