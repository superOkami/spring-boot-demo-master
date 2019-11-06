package com.xxl.job.executor.service.impl;

import com.xxl.job.executor.dao.PreFileDao;
import com.xxl.job.executor.model.PreFile;
import com.xxl.job.executor.service.PreFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Auto created by codeAppend plugin
 */
@Service
public class PreFileServiceImpl  implements PreFileService {
    @Resource
    PreFileDao preFileDao;
    @Override
    public void preFileSave(String param) {
        PreFile preFile = new PreFile();
        preFileDao.preFileSave(preFile);
    }

    // use "baseMapper" to call jdbc
    // example: baseMapper.insert(entity);
    // example: baseMapper.selectByPage(params);
   
}