package com.xxl.job.executor.service.impl;

import com.xxl.job.executor.dao.PreApasinfoDao;
import com.xxl.job.executor.model.PreApasinfo;
import com.xxl.job.executor.service.PreApasinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Auto created by codeAppend plugin
 */
@Service
public class PreApasinfoServiceImpl  implements PreApasinfoService {
    @Resource
    PreApasinfoDao preApasinfoDao;
    @Override
    public void preApasinfoSave(String param) {
        PreApasinfo preApasinfo = new PreApasinfo();
        preApasinfoDao.preApasinfoSave(preApasinfo);
    }

    // use "baseMapper" to call jdbc
    // example: baseMapper.insert(entity);
    // example: baseMapper.selectByPage(params);
   
}