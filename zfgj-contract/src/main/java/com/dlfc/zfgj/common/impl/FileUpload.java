package com.dlfc.zfgj.common.impl;

import com.dlfc.zfgj.common.Upload;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by walden on 2017/2/17.
 */
@Slf4j
@Getter
@Setter
@Component
public class FileUpload implements Upload<CommonsMultipartFile> {

    @Value("${upload.path}")
    private String uploadPath;

    private CommonsMultipartFile commonsMultipartFile;

    @Override
    public CommonsMultipartFile upload(CommonsMultipartFile commonsMultipartFile) {
        String fileName = "";
        if (commonsMultipartFile != null){
            fileName = commonsMultipartFile.getOriginalFilename();
            this.commonsMultipartFile = commonsMultipartFile;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(uploadPath+fileName);
            FileInputStream fileInputStream = (FileInputStream) commonsMultipartFile.getInputStream();
            int b = 0;
            while((b=fileInputStream.read()) != -1){
                fileOutputStream.write(b);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            FileUpload.log.error(e.getMessage());
        }
        return commonsMultipartFile;
    }
}
