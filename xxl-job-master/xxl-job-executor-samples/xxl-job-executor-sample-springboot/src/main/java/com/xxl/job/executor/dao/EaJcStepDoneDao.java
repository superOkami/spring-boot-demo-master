package com.xxl.job.executor.dao;

import com.xxl.job.executor.model.EaJcStepDone;
import org.apache.ibatis.annotations.Mapper;

/**
 * Auto created by codeAppend plugin
 */
@Mapper
public interface EaJcStepDoneDao {
    void eaJcStepDoneSave(EaJcStepDone eaJcStepDone);

    void doneDelete(String ORGBUSNO);
}