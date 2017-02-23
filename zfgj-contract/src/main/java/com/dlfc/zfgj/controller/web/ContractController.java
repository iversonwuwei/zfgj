package com.dlfc.zfgj.controller.web;

import com.dlfc.zfgj.convertor.ContractConvertor;
import com.dlfc.zfgj.dto.*;
import com.dlfc.zfgj.dto.base.ListResultDTO;
import com.dlfc.zfgj.dto.base.ResultDTO;
import com.dlfc.zfgj.entity.ConContract;
import com.dlfc.zfgj.exception.CustomRuntimeException;
import com.dlfc.zfgj.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by walden on 2017/2/15.
 */
@RestController
@RequestMapping(value = "/w/contracts")
public class ContractController {

    @Autowired
    private ContractService contractService;

    @Autowired
    private ContractConvertor contractConvertor;
    /**
     * Show all contracts which belongs to the user
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public ListResultDTO<ContractDTO> contractList() throws CustomRuntimeException {
        List<ConContract> contracts = contractService.getAllContracts();
        return contractConvertor.toResultDTO(contracts);
    }

    /**
     * Show the detail of the contract
     * @param contractid
     * @return
     */
    @RequestMapping(value = "/{contractid}/detail", method = RequestMethod.GET)
    public ResultDTO<ContractDTO> contractDetail(@PathVariable String contractid) throws CustomRuntimeException {
        ConContract contract = contractService.findOne(contractid);
        if (contract == null){
            throw new CustomRuntimeException("","");
        }
        return contractConvertor.toResultDTO(contract);
    }

    /**
     * 搜索条件：合同编号，签约经纪人，出租方，承租方
     * @param searchParam 搜索参数
     * @param searchMethod 搜索条件 同 搜索条件
     */
    @RequestMapping(value = "/search/{searchParam}/{searchMethod}", method = RequestMethod.GET)
    public ListResultDTO<ContractDTO> searchByContractid(@PathVariable String searchParam, @PathVariable String searchMethod){
        //TODO do search

        return null;
    }

    /**
     * 合同初始化
     * @param contractStep1DTO
     * @return
     */
    @RequestMapping(value = "/create/{contractid}", method = RequestMethod.POST)
    public ResultDTO<ContractStep1DTO> init(@PathVariable String contractid,
                                            @RequestBody @Valid ContractStep1DTO contractStep1DTO){
        //TODO init

        return null;
    }

    /**
     * 合同新建第二步
     * @param contractStep2DTO
     * @return
     */
    @RequestMapping(value = "/create/step2/{contractid}", method = RequestMethod.POST)
    public ResultDTO<ContractStep2DTO> step2(@PathVariable String contractid,
                                             @RequestBody @Valid ContractStep2DTO contractStep2DTO){
        //TODO Step2
        return null;
    }

    /**
     * 存入实际使用人列表
     * 存入时如有多名使用人，多次提交写入。
     * @param user
     * @return
     */
    @RequestMapping(value = "/users/{contractid}", method = RequestMethod.POST)
    public ResultDTO<HouseUserDTO> houseUser(@PathVariable String contractid,
                                             @RequestBody @Valid HouseUserDTO user){

        //TODO 房屋使用人存入
        return null;
    }

    /**
     * 合同新建第三步
     * @param contractStep3DTO
     * @return
     */
    @RequestMapping(value = "/create/step3/{contractid}", method = RequestMethod.POST)
    public ResultDTO<ContractStep3DTO> step3(@PathVariable String contractid,
                                             @RequestBody @Valid ContractStep3DTO contractStep3DTO){
        //TODO
        return null;
    }

    /**
     * 合同新建第四步
     * @param contractStep4DTO
     * @return
     */
    @RequestMapping(value = "/create/step4/{contractid}", method = RequestMethod.POST)
    public ResultDTO<ContractStep4DTO> step4(@PathVariable String contractid,
                                             @RequestBody @Valid ContractStep4DTO contractStep4DTO){

        //TODO
        return null;
    }

    /**
     * 保存提交项目 - 多个项目分多次提交
     * @param deliverItemDTO
     * @return
     */
    @RequestMapping(value = "/deliverItems/{contactid}", method = RequestMethod.POST)
    public ResultDTO<DeliverItemDTO> deliverItem(@PathVariable String contractid,
                                                 @RequestBody @Valid DeliverItemDTO deliverItemDTO){
        //TODO

        return null;
    }

    @RequestMapping(value = "/others/{contactid}", method = RequestMethod.POST)
    public ResultDTO<OtherRelatedItemDTO> others(@PathVariable String contractid,
                                                 @RequestBody @Valid OtherRelatedItemDTO otherRelatedItemDTO){
        //TODO
        return null;
    }
}
