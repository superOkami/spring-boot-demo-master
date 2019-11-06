package com.xxl.job.executor.service.impl;

import com.xxl.job.executor.dao.EaJcFeeinfoDao;
import com.xxl.job.executor.model.EaJcFeeinfo;
import com.xxl.job.executor.service.EaJcFeeinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Auto created by codeAppend plugin
 */
@Service
public class EaJcFeeinfoServiceImpl  implements EaJcFeeinfoService {
    @Resource
    EaJcFeeinfoDao eaJcFeeinfoDao;
    @Override
    public void eaJcFeeinfoSave(String param) {
        EaJcFeeinfo eaJcFeeinfo = new EaJcFeeinfo();
        //JSONObject jsonObject = JSONObject.parseObject(param);
        //eaJcFeeinfo.setDATAVER((Integer) (jsonObject.get("DATAVER")==null?"":jsonObject.get("DATAVER")));
        //eaJcFeeinfo.setDESCRIBE(jsonObject.get("DESCRIBE")==null?"": (String) jsonObject.get("DESCRIBE"));
        //eaJcFeeinfo.setDICCODE(jsonObject.get("DICCODE")==null?"": (String) jsonObject.get("DICCODE"));
        //eaJcFeeinfo.setDICNAME(jsonObject.get("DICNAME")==null?"": (String) jsonObject.get("DICNAME"));
        //eaJcFeeinfo.setEXT1(jsonObject.get("EXT1")==null?"": (String) jsonObject.get("EXT1"));
        //eaJcFeeinfo.setEXT2(jsonObject.get("EXT2")==null?"": (String) jsonObject.get("EXT2"));
        //eaJcFeeinfo.setEXT3(jsonObject.get("EXT3")==null?"": (String) jsonObject.get("EXT3"));
        //eaJcFeeinfo.setEXT4(jsonObject.get("EXT4")==null?"": (String) jsonObject.get("EXT"));
        ////eaJcServevalDict.setMAKETIME((Date) (jsonObject.get("")==null?"":jsonObject.get("")));
        //eaJcFeeinfo.setREGIONID(jsonObject.get("REGIONID")==null?"": (String) jsonObject.get("REGIONID"));
        //eaJcFeeinfo.setSIGNSTATE(jsonObject.get("SIGNSTATE")==null?"": (String) jsonObject.get("SIGNSTATE"));
        //eaJcFeeinfo.setID(jsonObject.get("ID")==null?"": (String) jsonObject.get("ID"));
        eaJcFeeinfoDao.eaJcFeeinfoSave(eaJcFeeinfo);
    }

    // use "baseMapper" to call jdbc
    // example: baseMapper.insert(entity);
    // example: baseMapper.selectByPage(params);
   
}