package com.xxl.job.executor.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.xxl.job.executor.dao.EaJcStepSpecialnodeDao;
import com.xxl.job.executor.model.EaJcStepSpecialnode;
import com.xxl.job.executor.service.EaJcStepSpecialnodeService;
import com.xxl.job.executor.util.DateFp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Auto created by codeAppend plugin
 */
@Service
public class EaJcStepSpecialnodeServiceImpl implements EaJcStepSpecialnodeService {
    @Resource
    EaJcStepSpecialnodeDao eaJcStepSpecialnodeDao;
    @Override
    public void eaJcStepSpecialnodeSave(String param) {
        EaJcStepSpecialnode eaJcStepSpecialnode = new EaJcStepSpecialnode();
        JSONObject jsonObject = JSONObject.parseObject(param);
        eaJcStepSpecialnode.setPROJID(jsonObject.get("PROJID")==null?"": (String) jsonObject.get("PROJID"));
        eaJcStepSpecialnode.setDATAVER(jsonObject.get("DATAVER")==null?-1: Integer.parseInt(jsonObject.getString("DATAVER")));
        eaJcStepSpecialnode.setORGBUSNO(jsonObject.get("ORGBUSNO")==null?"": (String) jsonObject.get("ORGBUSNO"));
        eaJcStepSpecialnode.setSN((jsonObject.get("SN")==null?null: Integer.parseInt(jsonObject.getString("SN"))));
        eaJcStepSpecialnode.setREGIONID(jsonObject.get("REGIONID")==null?"": (String) jsonObject.get("REGIONID"));
        eaJcStepSpecialnode.setSTDVER(jsonObject.get("STDVER")==null?-1:  Integer.parseInt(jsonObject.getString("STDVER")));
        eaJcStepSpecialnode.setNODENAME(jsonObject.get("NODENAME")==null?"": (String) jsonObject.get("NODENAME"));
        eaJcStepSpecialnode.setNODEPROCADDR(jsonObject.get("NODEPROCADDR")==null?"": (String) jsonObject.get("NODEPROCADDR"));
        eaJcStepSpecialnode.setNODEPROCADV(jsonObject.get("NODEPROCADV")==null?"": (String) jsonObject.get("NODEPROCADV"));
        eaJcStepSpecialnode.setNOTETIME((jsonObject.get("NOTETIME")==null?null: DateFp.parse(jsonObject.getString("NOTETIME"))));
        eaJcStepSpecialnode.setPROCERNAME(jsonObject.get("PROCERNAME")==null?"": (String) jsonObject.get("PROCERNAME"));
        eaJcStepSpecialnode.setPROCERREMARK(jsonObject.get("PROCERREMARK")==null?"": (String) jsonObject.get("PROCERREMARK"));
        eaJcStepSpecialnode.setPROCERID(jsonObject.get("PROCERID")==null?"": (String) jsonObject.get("PROCERID"));
        eaJcStepSpecialnode.setPROCUNITNAME(jsonObject.get("PROCUNITNAME")==null?"": (String) jsonObject.get("PROCUNITNAME"));
        eaJcStepSpecialnode.setPROCUNITID(jsonObject.get("PROCUNITID")==null?"": (String) jsonObject.get("PROCUNITID"));
        eaJcStepSpecialnode.setNODESTARTTIME (jsonObject.get("NODESTARTTIME")==null?null: DateFp.parse(jsonObject.getString("NODESTARTTIME")));
        eaJcStepSpecialnode.setNODEENDTIME (jsonObject.get("NODEENDTIME")==null?null: DateFp.parse(jsonObject.getString("NODEENDTIME")));
        eaJcStepSpecialnode.setNODEPROCACCORD(jsonObject.get("NODEPROCACCORD")==null?"": (String) jsonObject.get("NODEPROCACCORD"));
        eaJcStepSpecialnode.setLISTS(jsonObject.get("LISTS")==null?"": (String) jsonObject.get("LISTS"));
        eaJcStepSpecialnode.setNODETIME(jsonObject.get("NODETIME")==null?null: DateFp.parse(jsonObject.getString("NODETIME")));
        eaJcStepSpecialnode.setNODERESULT(jsonObject.get("NODERESULT")==null?"": (String) jsonObject.get("NODERESULT"));
        eaJcStepSpecialnode.setSIGNSTATE(jsonObject.get("SIGNSTATE")==null?"": (String) jsonObject.get("SIGNSTATE"));
        eaJcStepSpecialnode.setEXT1(jsonObject.get("EXT1")==null?"": (String) jsonObject.get("EXT1"));
        eaJcStepSpecialnode.setEXT2(jsonObject.get("EXT2")==null?"": (String) jsonObject.get("EXT2"));
        eaJcStepSpecialnode.setEXT3(jsonObject.get("EXT3")==null?"": (String) jsonObject.get("EXT3"));
        eaJcStepSpecialnode.setEXT4(jsonObject.get("EXT4")==null?"": (String) jsonObject.get("EXT"));
        eaJcStepSpecialnodeDao.eaJcStepSpecialnodeSave(eaJcStepSpecialnode);
    }

    // use "baseMapper" to call jdbc
    // example: baseMapper.insert(entity);
    // example: baseMapper.selectByPage(params);
   
}