package com.xxl.job.executor.dao;

import com.xxl.job.executor.model.PreCommForm;
import org.apache.ibatis.annotations.Mapper;

/**
 * Auto created by codeAppend plugin
 */
@Mapper
public interface PreCommFormDao  {
    void preCommFormSave(PreCommForm preCommForm);
}