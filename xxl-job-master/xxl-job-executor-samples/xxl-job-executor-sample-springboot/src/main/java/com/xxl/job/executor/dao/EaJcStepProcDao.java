package com.xxl.job.executor.dao;

import com.xxl.job.executor.model.EaJcStepProc;
import org.apache.ibatis.annotations.Mapper;

/**
 * Auto created by codeAppend plugin
 */
@Mapper
public interface EaJcStepProcDao {
    EaJcStepProc get(String param);
    void eaJcStepProcSave(EaJcStepProc eaJcStepProc);
    void eaJcStepProcDelete(String ORGBUSNO);

}