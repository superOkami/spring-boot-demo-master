package com.xxl.job.executor.service.impl;

import com.xxl.job.executor.dao.PreCommFormDao;
import com.xxl.job.executor.model.PreCommForm;
import com.xxl.job.executor.service.PreCommFormService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Auto created by codeAppend plugin
 */
@Service
public class PreCommFormServiceImpl  implements PreCommFormService {
    @Resource
    PreCommFormDao preCommFormDao;
    @Override
    public void preCommFormSave(String param) {
        PreCommForm preCommForm = new PreCommForm();
        preCommFormDao.preCommFormSave(preCommForm);
    }

    // use "baseMapper" to call jdbc
    // example: baseMapper.insert(entity);
    // example: baseMapper.selectByPage(params);
   
}