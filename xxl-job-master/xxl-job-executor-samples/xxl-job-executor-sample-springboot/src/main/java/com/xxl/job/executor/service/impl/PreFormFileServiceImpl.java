package com.xxl.job.executor.service.impl;

import com.xxl.job.executor.dao.PreFormFileDao;
import com.xxl.job.executor.model.PreFormFile;
import com.xxl.job.executor.service.PreFormFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Auto created by codeAppend plugin
 */
@Service
public class PreFormFileServiceImpl  implements PreFormFileService {
    @Resource
    PreFormFileDao preFormFileDao;
    @Override
    public void preFormFileSave(String param) {
        PreFormFile preFormFile = new PreFormFile();
        preFormFileDao.preFormFileSave(preFormFile);
    }

    // use "baseMapper" to call jdbc
    // example: baseMapper.insert(entity);
    // example: baseMapper.selectByPage(params);
   
}