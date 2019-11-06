package com.xxl.job.executor.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.xxl.job.executor.dao.EaJcStepDoneDao;
import com.xxl.job.executor.model.EaJcStepDone;
import com.xxl.job.executor.service.EaJcStepDoneService;
import com.xxl.job.executor.util.DateFp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Auto created by codeAppend plugin
 */
@Service
@Transactional
public class EaJcStepDoneServiceImpl  implements EaJcStepDoneService {
    @Resource
    EaJcStepDoneDao eaJcStepDoneDao;
    @Override
    public void eaJcStepDoneSave(String param) {
        EaJcStepDone eaJcStepDone = new EaJcStepDone();
        JSONObject jsonObject = JSONObject.parseObject(param);
        String state = jsonObject.getString("state");
        if (state.equals("1")) {
            eaJcStepDone.setPROJID(jsonObject.get("PROJID") == null ? "" : (String) jsonObject.get("PROJID"));
            eaJcStepDone.setDATAVER( (jsonObject.get("DATAVER") == null ? 1 : Integer.parseInt(jsonObject.getString("DATAVER"))));
            eaJcStepDone.setORGBUSNO(jsonObject.get("ORGBUSNO") == null ? "" : (String) jsonObject.get("ORGBUSNO"));
            eaJcStepDone.setDONERESULT(jsonObject.get("DONERESULT") == null ? "" : (String) jsonObject.get("DONERESULT"));
            eaJcStepDone.setREGIONID(jsonObject.get("REGIONID") == null ? "" : (String) jsonObject.get("REGIONID"));
            eaJcStepDone.setSTDVER( (jsonObject.get("STDVER") == null ? -1 : Integer.parseInt(jsonObject.getString("STDVER"))));
            eaJcStepDone.setEXITRES(jsonObject.get("EXITRES") == null ? "" : (String) jsonObject.get("EXITRES"));
            eaJcStepDone.setCERTIFICATENAM(jsonObject.get("CERTIFICATENAM") == null ? "" : (String) jsonObject.get("CERTIFICATENAM"));
            eaJcStepDone.setCERTIFICATENO(jsonObject.get("CERTIFICATENO") == null ? "" : (String) jsonObject.get("CERTIFICATENO"));
            eaJcStepDone.setCERTIFICATELIMIT(jsonObject.get("CERTIFICATELIMIT") == null ? "" : (String) jsonObject.get("CERTIFICATELIMIT"));
            eaJcStepDone.setPUBLISHER(jsonObject.get("PUBLISHER") == null ? "" : (String) jsonObject.get("PUBLISHER"));
            eaJcStepDone.setISFEE(jsonObject.get("ISFEE") == null ? "" : (String) jsonObject.get("ISFEE"));
            eaJcStepDone.setFEE((jsonObject.get("FEE") == null ? null : Integer.parseInt(jsonObject.getString("FEE"))));
            eaJcStepDone.setFEESTANDARD(jsonObject.get("FEESTANDARD") == null ? "" : (String) jsonObject.get("FEESTANDARD"));
            eaJcStepDone.setFEESTANDACCORD(jsonObject.get("FEESTANDACCORD") == null ? "" : (String) jsonObject.get("FEESTANDACCORD"));
            eaJcStepDone.setPAYPERSONNAME(jsonObject.get("PAYPERSONNAME") == null ? "" : (String) jsonObject.get("PAYPERSONNAME"));
            eaJcStepDone.setPAYPERIDCARD(jsonObject.get("PAYPERIDCARD") == null ? "" : (String) jsonObject.get("PAYPERIDCARD"));
            eaJcStepDone.setPAYERMOBILE(jsonObject.get("PAYERMOBILE") == null ? "" : (String) jsonObject.get("PAYERMOBILE"));
            eaJcStepDone.setPAYERTEL(jsonObject.get("PAYERTEL") == null ? "" : (String) jsonObject.get("PAYERTEL"));
            eaJcStepDone.setOCCURTIME( (jsonObject.get("OCCURTIME") == null ? null : DateFp.parse(jsonObject.getString("OCCURTIME"))));
            eaJcStepDone.setTRANSACTOR(jsonObject.get("TRANSACTOR") == null ? "" : (String) jsonObject.get("TRANSACTOR"));
            eaJcStepDone.setSIGNSTATE(jsonObject.get("SIGNSTATE") == null ? "" : (String) jsonObject.get("SIGNSTATE"));
            eaJcStepDone.setEXT1(jsonObject.get("EXT1") == null ? "" : (String) jsonObject.get("EXT1"));
            eaJcStepDone.setEXT2(jsonObject.get("EXT2") == null ? "" : (String) jsonObject.get("EXT2"));
            eaJcStepDone.setEXT3(jsonObject.get("EXT3") == null ? "" : (String) jsonObject.get("EXT3"));
            eaJcStepDone.setEXT4(jsonObject.get("EXT4") == null ? "" : (String) jsonObject.get("EXT"));
            eaJcStepDoneDao.eaJcStepDoneSave(eaJcStepDone);
        }else if (state.equals("2")){
            String ORGBUSNO = (String) jsonObject.get("ORGBUSNO");
            eaJcStepDoneDao.doneDelete(ORGBUSNO);
        }

    }

    // use "baseMapper" to call jdbc
    // example: baseMapper.insert(entity);
    // example: baseMapper.selectByPage(params);
   
}