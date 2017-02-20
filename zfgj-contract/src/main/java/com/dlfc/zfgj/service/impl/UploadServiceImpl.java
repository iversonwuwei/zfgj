package com.dlfc.zfgj.service.impl;

import com.dlfc.zfgj.common.Upload;
import com.dlfc.zfgj.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by walden on 2017/2/17.
 */
@Service
@Transactional
public class UploadServiceImpl implements UploadService<CommonsMultipartFile> {

    @Autowired
    private Upload upload;

    private List<CommonsMultipartFile> commonsMultipartFiles;

    private CommonsMultipartFile commonsMultipartFile;

    @Override
    public List<CommonsMultipartFile> upload(CommonsMultipartFile[] files) {
        commonsMultipartFiles = new ArrayList<>();
        if (files == null){
            throw new NullPointerException("");
        }
        for (int i = 0; i<files.length; i++){
             commonsMultipartFile = (CommonsMultipartFile) upload.upload(files[i]);
             commonsMultipartFiles.add(commonsMultipartFile);
        }
        return commonsMultipartFiles;
    }
}
