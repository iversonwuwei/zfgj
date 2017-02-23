package com.dlfc.zfgj.service.impl;

import com.dlfc.zfgj.entity.ConContract;
import com.dlfc.zfgj.entity.ConContractExample;
import com.dlfc.zfgj.exception.CustomRuntimeException;
import com.dlfc.zfgj.mapper.ConContractMapper;
import com.dlfc.zfgj.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by walden on 2017/2/22.
 */
@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ConContractMapper conContractMapper;
    @Autowired
    private ConContractExample conContractExample;


    @Override
    public List<ConContract> getAllContracts() {
        conContractExample.setDistinct(false);
        List<ConContract> conContracts = conContractMapper.selectByExample(conContractExample);
        return conContracts;
    }

    @Override
    public ConContract findOne(String id) throws CustomRuntimeException {
        ConContract conContract = conContractMapper.findOne(id);
        if (conContract == null){
            throw new CustomRuntimeException("","");
        }
        return conContract;
    }
}
