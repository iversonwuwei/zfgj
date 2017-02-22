package com.dlfc.zfgj.service;

import com.dlfc.zfgj.entity.ConContract;
import com.dlfc.zfgj.exception.CustomRuntimeException;

import java.util.List;

/**
 * Created by walden on 2017/2/22.
 */
public interface ContractService {

    List<ConContract> getAllContracts();

    ConContract findOne(String id) throws CustomRuntimeException;
}
