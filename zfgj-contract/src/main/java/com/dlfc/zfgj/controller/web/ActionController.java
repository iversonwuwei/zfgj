package com.dlfc.zfgj.controller.web;

import com.dlfc.zfgj.dto.base.ResultDTO;
import com.dlfc.zfgj.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;

/**
 * Created by walden on 2017/2/16.
 */
@RestController
@RequestMapping(value = "/w/actions")
public class ActionController {
    @Autowired
    private UploadService uploadService;
    /**
     * 下载文件
     * @param files
     * @return
     */
    @RequestMapping(value = "/donwload", method = RequestMethod.POST)
    public ResultDTO<Void> donwload(@RequestBody CommonsMultipartFile[] files){
        //TODO download file


        return ResultDTO.success();
    }

    /**
     * 上传文件
     * @param files
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ResultDTO<Void> upload(@RequestBody CommonsMultipartFile[] files){
        //TODO upload file to server
        List<CommonsMultipartFile> uploadedFiles = uploadService.upload(files);

        return ResultDTO.success();
    }

    /**
     * 身份证验证
     * @param id
     * @return
     */
    @RequestMapping(value = "/identies/{id}/verify", method = RequestMethod.GET)
    public Integer verify(@PathVariable String id){
        //TODO 身份证验证

        return 0;
    }

    /**
     * 电话号码验证
     * @param number
     * @return
     */
    @RequestMapping(value = "/numbers/{number}/verify", method = RequestMethod.GET)
    public Integer verifyNumber(@PathVariable String number){
        //TODO 身份证验证

        return 0;
    }
}
