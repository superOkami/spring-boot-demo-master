package com.xxl.job.executor.service.impl;

import com.xxl.job.executor.dao.EaJcServevalDao;
import com.xxl.job.executor.model.EaJcServeval;
import com.xxl.job.executor.service.EaJcServevalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Auto created by codeAppend plugin
 */
@Service
public class EaJcServevalServiceImpl  implements EaJcServevalService {
    @Resource
    EaJcServevalDao eaJcServevalDao;
    @Override
    public void eaJcServevalSave(String param) {
        EaJcServeval eaJcServeval = new EaJcServeval();
        eaJcServevalDao.eaJcServevalSave(eaJcServeval);
    }

    // use "baseMapper" to call jdbc
    // example: baseMapper.insert(entity);
    // example: baseMapper.selectByPage(params);
   
}