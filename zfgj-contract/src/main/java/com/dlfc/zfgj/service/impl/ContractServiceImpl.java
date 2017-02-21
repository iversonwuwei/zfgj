package com.dlfc.zfgj.service.impl;

import com.dlfc.zfgj.model.Contract;
import com.dlfc.zfgj.model.ContractExample;
import com.dlfc.zfgj.repositories.ContractMapper;
import com.dlfc.zfgj.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by walden on 2017/2/21.
 */
@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractMapper contractMapper;

    @Autowired
    private ContractExample contractExample;

    @Override
    public List<Contract> getAllContractsBy(String param) {
        return null;
    }

    @Override
    public Contract selectContractById(String id) {
        Contract contract = contractMapper.selectById(id);
        return contract;
    }

    @Override
    public List<Contract> getAllContracts() {
        contractExample.setDistinct(true);
        List<Contract> contracts = contractMapper.selectByExample(contractExample);
        return contracts;
    }
}
