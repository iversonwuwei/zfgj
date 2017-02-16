package com.dlfc.zfgj.controller;

import com.dlfc.zfgj.dto.base.ResultDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

/**
 * Created by walden on 2017/2/16.
 */
@RestController
@RequestMapping(value = "/w/actions")
public class ActionController {

    /**
     * 下载文件
     * @param file
     * @return
     */
    @RequestMapping(value = "/donwload/{file}", method = RequestMethod.POST)
    public ResultDTO<Void> donwload(@PathVariable File file){
        //TODO download file
        return null;
    }

    /**
     * 上传文件
     * @param file
     * @return
     */
    @RequestMapping(value = "/upload/{file}", method = RequestMethod.POST)
    public ResultDTO<Void> upload(@PathVariable File file){
        //TODO upload file to server
        return null;
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
