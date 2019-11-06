package com.xxl.job.executor.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.xxl.job.executor.dao.EaJcStepProcDao;
import com.xxl.job.executor.model.EaJcStepProc;
import com.xxl.job.executor.service.EaJcStepProcService;
import com.xxl.job.executor.util.DateFp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Auto created by codeAppend plugin
 */
@Service
@Transactional
public class EaJcStepProcServiceImpl implements EaJcStepProcService {
    @Resource
    EaJcStepProcDao eaJcStepProcDao;

    @Override
    public void eaJcStepProcSave(String param) {
        EaJcStepProc eaJcStepProc = new EaJcStepProc();
        JSONObject jsonObject = JSONObject.parseObject(param);
        String state = jsonObject.getString("state");
        if (state.equals("1")) {
            eaJcStepProc.setPROJID(jsonObject.get("PROJID") == null ? "" : (String) jsonObject.get("PROJID"));
            eaJcStepProc.setDATAVER((jsonObject.get("DATAVER") == null ? 1 : Integer.parseInt(jsonObject.getString("DATAVER"))));
            eaJcStepProc.setORGBUSNO(jsonObject.get("ORGBUSNO") == null ? "" : (String) jsonObject.get("ORGBUSNO"));
            eaJcStepProc.setSN(jsonObject.get("SN") == null ? -1 : Integer.parseInt(jsonObject.getString("SN")));
            eaJcStepProc.setREGIONID(jsonObject.get("REGIONID") == null ? "" : (String) jsonObject.get("REGIONID"));
            eaJcStepProc.setSTDVER(jsonObject.get("STDVER") == null ? -1 : Integer.parseInt(jsonObject.getString("STDVER")));
            eaJcStepProc.setNODENAME(jsonObject.get("NODENAME") == null ? "" : (String) jsonObject.get("NODENAME"));
            eaJcStepProc.setNODECODE(jsonObject.get("NODECODE") == null ? "" : (String) jsonObject.get("NODECODE"));
            eaJcStepProc.setNODETYPE(jsonObject.get("NODETYPE") == null ? "" : (String) jsonObject.get("NODETYPE"));
            eaJcStepProc.setNODEPROCER(jsonObject.get("NODEPROCER") == null ? "" : (String) jsonObject.get("NODEPROCER"));
            eaJcStepProc.setNODEPROCERNAME(jsonObject.get("NODEPROCERNAME") == null ? "" : (String) jsonObject.get("NODEPROCERNAME"));
            eaJcStepProc.setNODEPROCERAREA(jsonObject.get("NODEPROCERAREA") == null ? "" : (String) jsonObject.get("NODEPROCERAREA"));
            eaJcStepProc.setPROCUNIT(jsonObject.get("PROCUNIT") == null ? "" : (String) jsonObject.get("PROCUNIT"));
            eaJcStepProc.setPROCUNITNAME(jsonObject.get("PROCUNITNAME") == null ? "" : (String) jsonObject.get("PROCUNITNAME"));
            eaJcStepProc.setNODESTATE(jsonObject.get("NODESTATE") == null ? "" : (String) jsonObject.get("NODESTATE"));
            eaJcStepProc.setNODESTARTTIME(jsonObject.get("NODESTARTTIME") == null ? null : DateFp.parse(jsonObject.getString("NODESTARTTIME")));
            eaJcStepProc.setNODEENDTIME((jsonObject.get("NODEENDTIME") == null ? null : DateFp.parse(jsonObject.getString("NODEENDTIME"))));
            eaJcStepProc.setNODEADV(jsonObject.get("NODEADV") == null ? "" : (String) jsonObject.get("NODEADV"));
            eaJcStepProc.setTIMELIMIT((jsonObject.get("TIMELIMIT") == null ? null : Integer.parseInt(jsonObject.getString("TIMELIMIT"))));
            eaJcStepProc.setOCCURTIME((jsonObject.get("OCCURTIME") == null ? null : DateFp.parse(jsonObject.getString("OCCURTIME"))));
            eaJcStepProc.setPROMISETIMEUNIT(jsonObject.get("PROMISETIMEUNIT") == null ? "" : (String) jsonObject.get("PROMISETIMEUNIT"));
            eaJcStepProc.setNODERESULT(jsonObject.get("NODERESULT") == null ? "" : (String) jsonObject.get("NODERESULT"));
            eaJcStepProc.setSIGNSTATE(jsonObject.get("SIGNSTATE") == null ? "" : (String) jsonObject.get("SIGNSTATE"));
            eaJcStepProc.setNOTICE(jsonObject.get("NOTICE") == null ? "" : (String) jsonObject.get("NOTICE"));
            eaJcStepProc.setEXT1(jsonObject.get("EXT1") == null ? "" : (String) jsonObject.get("EXT1"));
            eaJcStepProc.setEXT2(jsonObject.get("EXT2") == null ? "" : (String) jsonObject.get("EXT2"));
            eaJcStepProc.setEXT3(jsonObject.get("EXT3") == null ? "" : (String) jsonObject.get("EXT3"));
            eaJcStepProc.setEXT4(jsonObject.get("EXT4") == null ? "" : (String) jsonObject.get("EXT"));
            try {
                eaJcStepProcDao.eaJcStepProcSave(eaJcStepProc);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (state.equals("2")) {
            String ORGBUSNO = (String) jsonObject.get("ORGBUSNO");
            try {
                eaJcStepProcDao.eaJcStepProcDelete(ORGBUSNO);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    // use "baseMapper" to call jdbc
    // example: baseMapper.insert(entity);
    // example: baseMapper.selectByPage(params);

}