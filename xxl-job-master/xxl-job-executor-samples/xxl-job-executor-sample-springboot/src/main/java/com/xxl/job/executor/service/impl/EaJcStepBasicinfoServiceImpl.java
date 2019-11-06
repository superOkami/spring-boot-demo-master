package com.xxl.job.executor.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.xxl.job.executor.dao.EaJcStepBasicinfoDao;
import com.xxl.job.executor.model.EaJcStepBasicinfo;
import com.xxl.job.executor.service.EaJcStepBasicinfoService;
import com.xxl.job.executor.util.DateFp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Auto created by codeAppend plugin
 */
@Service
@Transactional
public class EaJcStepBasicinfoServiceImpl  implements EaJcStepBasicinfoService {
    @Resource
    EaJcStepBasicinfoDao eaJcStepBasicinfoDao;
    @Override
    public void eaJcStepBasicinfoSave(String param) {
        EaJcStepBasicinfo eaJcStepBasicinfo = new EaJcStepBasicinfo();
        JSONObject jsonObject = JSONObject.parseObject(param);
        String state = jsonObject.getString("state");
        if (state.equals("1")) {
            eaJcStepBasicinfo.setPROJID(jsonObject.get("PROJID") == null ? "" : (String) jsonObject.get("PROJID"));
            eaJcStepBasicinfo.setDATAVER((jsonObject.get("DATAVER") == null ? 1 : Integer.parseInt((String) jsonObject.get("DATAVER"))));
            eaJcStepBasicinfo.setORGBUSNO(jsonObject.get("ORGBUSNO") == null ? "" : (String) jsonObject.get("ORGBUSNO"));
            eaJcStepBasicinfo.setPROJPWD(jsonObject.get("PROJPWD") == null ? "" : (String) jsonObject.get("PROJPWD"));
            eaJcStepBasicinfo.setREGIONID(jsonObject.get("REGIONID") == null ? "" : (String) jsonObject.get("REGIONID"));
            eaJcStepBasicinfo.setSTDVER((jsonObject.get("STDVER") == null ? -1 : Integer.parseInt((String) jsonObject.get("STDVER"))));
            eaJcStepBasicinfo.setITEMNO(jsonObject.get("ITEMNO") == null ? "" : (String) jsonObject.get("ITEMNO"));
            eaJcStepBasicinfo.setSUBITEMNO(jsonObject.get("SUBITEMNO") == null ? "" : (String) jsonObject.get("SUBITEMNO"));
            eaJcStepBasicinfo.setITEMNAME(jsonObject.get("ITEMNAME") == null ? "" : (String) jsonObject.get("ITEMNAME"));
            eaJcStepBasicinfo.setSUBITEMNAME(jsonObject.get("SUBITEMNAME") == null ? "" : (String) jsonObject.get("SUBITEMNAME"));
            eaJcStepBasicinfo.setPROJECTNAME(jsonObject.get("PROJECTNAME") == null ? "" : (String) jsonObject.get("PROJECTNAME"));
            eaJcStepBasicinfo.setAPPLICANT(jsonObject.get("APPLICANT") == null ? "" : (String) jsonObject.get("APPLICANT"));
            eaJcStepBasicinfo.setAPPLICANTMOBILE(jsonObject.get("APPLICANTMOBILE") == null ? "" : (String) jsonObject.get("APPLICANTMOBILE"));
            eaJcStepBasicinfo.setAPPLICANTTEL(jsonObject.get("APPLICANTTEL") == null ? "" : (String) jsonObject.get("APPLICANTTEL"));
            eaJcStepBasicinfo.setAPPLICANTEMAIL(jsonObject.get("APPLICANTEMAIL") == null ? "" : (String) jsonObject.get("APPLICANTEMAIL"));
            eaJcStepBasicinfo.setACCEPTLIST(jsonObject.get("ACCEPTLIST") == null ? "" : (String) jsonObject.get("ACCEPTLIST"));
            eaJcStepBasicinfo.setACCEPTDEPTID(jsonObject.get("ACCEPTDEPTID") == null ? "" : (String) jsonObject.get("ACCEPTDEPTID"));
            eaJcStepBasicinfo.setACCEPTDEPTNAME(jsonObject.get("ACCEPTDEPTNAME") == null ? "" : (String) jsonObject.get("ACCEPTDEPTNAME"));
            eaJcStepBasicinfo.setAPPROVALTYPE(jsonObject.get("APPROVALTYPE") == null ? "" : (String) jsonObject.get("APPROVALTYPE"));
            eaJcStepBasicinfo.setPROMISETIMELIMIT((jsonObject.get("PROMISETIMELIMIT") == null ? -1 : Integer.parseInt((String) jsonObject.get("PROMISETIMELIMIT"))));
            eaJcStepBasicinfo.setPROMISETIMEUNIT(jsonObject.get("PROMISETIMEUNIT") == null ? "" : (String) jsonObject.get("PROMISETIMEUNIT"));
            eaJcStepBasicinfo.setTIMELIMIT((jsonObject.get("TIMELIMIT") == null ? -1 : Integer.parseInt((String) jsonObject.get("PROMISETIMELIMIT"))));
            eaJcStepBasicinfo.setTIMEUNIT(jsonObject.get("TIMEUNIT") == null ? "" : (String) jsonObject.get("TIMEUNIT"));
            eaJcStepBasicinfo.setSUBMIT(jsonObject.get("SUBMIT") == null ? "" : (String) jsonObject.get("SUBMIT"));
            eaJcStepBasicinfo.setOCCURTIME( (jsonObject.get("OCCURTIME") == null ? null : DateFp.parse(jsonObject.getString("OCCURTIME"))));
            eaJcStepBasicinfo.setTRANSACTOR(jsonObject.get("TRANSACTOR") == null ? "" : (String) jsonObject.get("TRANSACTOR"));
            eaJcStepBasicinfo.setSIGNSTATE(jsonObject.get("SIGNSTATE") == null ? "" : (String) jsonObject.get("SIGNSTATE"));
            eaJcStepBasicinfo.setEXT1(jsonObject.get("EXT1") == null ? "" : (String) jsonObject.get("EXT1"));
            eaJcStepBasicinfo.setEXT2(jsonObject.get("EXT2") == null ? "" : (String) jsonObject.get("EXT2"));
            eaJcStepBasicinfo.setEXT3(jsonObject.get("EXT3") == null ? "" : (String) jsonObject.get("EXT3"));
            eaJcStepBasicinfo.setEXT4(jsonObject.get("EXT4") == null ? "" : (String) jsonObject.get("EXT"));
            eaJcStepBasicinfoDao.eaJcStepBasicinfoSave(eaJcStepBasicinfo);
        }else if (state.equals("2")){
            String ORGBUSNO = (String) jsonObject.get("ORGBUSNO");
            eaJcStepBasicinfoDao.basicinfoDelete(ORGBUSNO);
        }
    }

    // use "baseMapper" to call jdbc
    // example: baseMapper.insert(entity);
    // example: baseMapper.selectByPage(params);
   
}