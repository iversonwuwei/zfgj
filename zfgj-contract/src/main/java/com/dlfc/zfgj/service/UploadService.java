package com.dlfc.zfgj.service;

import java.util.List;

/**
 * Created by walden on 2017/2/17.
 */
public interface UploadService<T> {

    List<T> upload(T[] ts);
}
