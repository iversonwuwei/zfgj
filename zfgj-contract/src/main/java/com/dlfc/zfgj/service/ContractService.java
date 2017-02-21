package com.dlfc.zfgj.service;

import com.dlfc.zfgj.model.Contract;

import java.util.List;

/**
 * Created by walden on 2017/2/16.
 */
public interface ContractService {

    List<Contract> getAllContractsBy(String param);

    Contract selectContractById(String id);

    List<Contract> getAllContracts();
}
