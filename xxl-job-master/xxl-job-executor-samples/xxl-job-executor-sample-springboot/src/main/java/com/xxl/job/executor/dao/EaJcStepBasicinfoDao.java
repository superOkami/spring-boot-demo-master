package com.xxl.job.executor.dao;

import com.xxl.job.executor.model.EaJcStepBasicinfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Auto created by codeAppend plugin
 */
@Mapper
public interface EaJcStepBasicinfoDao {
    void eaJcStepBasicinfoSave(EaJcStepBasicinfo eaJcStepBasicinfo);

    void basicinfoDelete(String ORGBUSNO);
}