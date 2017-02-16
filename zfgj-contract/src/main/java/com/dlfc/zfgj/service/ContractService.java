package com.dlfc.zfgj.service;

import com.dlfc.zfgj.dto.ContractDTO;

import java.util.List;

/**
 * Created by walden on 2017/2/16.
 */
public interface ContractService {

    List<ContractDTO> getAllContractsBy(String param);

    List<ContractDTO> getAllContracts();
}
