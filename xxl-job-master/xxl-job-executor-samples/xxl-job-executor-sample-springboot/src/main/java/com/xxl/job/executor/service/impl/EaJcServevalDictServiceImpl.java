package com.xxl.job.executor.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.xxl.job.executor.dao.EaJcServevalDictDao;
import com.xxl.job.executor.model.EaJcServevalDict;
import com.xxl.job.executor.service.EaJcServevalDictService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Auto created by codeAppend plugin
 */
@Service
@Transactional
public class EaJcServevalDictServiceImpl  implements EaJcServevalDictService {
    @Resource
    private EaJcServevalDictDao eaJcServevalDictDao;
    @Override
    public void eaJcServevalDictSave(String param) {
        JSONObject jsonObject = JSONObject.parseObject(param);
        EaJcServevalDict eaJcServevalDict =new EaJcServevalDict();
        eaJcServevalDict.setDATAVER((Integer) (jsonObject.get("DATAVER")==null?"":jsonObject.get("DATAVER")));
        eaJcServevalDict.setDESCRIBE(jsonObject.get("DESCRIBE")==null?"": (String) jsonObject.get("DESCRIBE"));
        eaJcServevalDict.setDICCODE(jsonObject.get("DICCODE")==null?"": (String) jsonObject.get("DICCODE"));
        eaJcServevalDict.setDICNAME(jsonObject.get("DICNAME")==null?"": (String) jsonObject.get("DICNAME"));
        eaJcServevalDict.setEXT1(jsonObject.get("EXT1")==null?"": (String) jsonObject.get("EXT1"));
        eaJcServevalDict.setEXT2(jsonObject.get("EXT2")==null?"": (String) jsonObject.get("EXT2"));
        eaJcServevalDict.setEXT3(jsonObject.get("EXT3")==null?"": (String) jsonObject.get("EXT3"));
        eaJcServevalDict.setEXT4(jsonObject.get("EXT4")==null?"": (String) jsonObject.get("EXT"));
        //eaJcServevalDict.setMAKETIME((Date) (jsonObject.get("")==null?"":jsonObject.get("")));
        eaJcServevalDict.setREGIONID(jsonObject.get("REGIONID")==null?"": (String) jsonObject.get("REGIONID"));
        eaJcServevalDict.setSIGNSTATE(jsonObject.get("SIGNSTATE")==null?"": (String) jsonObject.get("SIGNSTATE"));
        eaJcServevalDict.setID(jsonObject.get("ID")==null?"": (String) jsonObject.get("ID"));
        eaJcServevalDictDao.eaJcServevalDictSave(eaJcServevalDict);
    }

    // use "baseMapper" to call jdbc
    // example: baseMapper.insert(entity);
    // example: baseMapper.selectByPage(params);
   
}