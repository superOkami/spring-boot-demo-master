package com.xxl.job.executor.dao;

import com.xxl.job.executor.model.PreFile;
import org.apache.ibatis.annotations.Mapper;

/**
 * Auto created by codeAppend plugin
 */
@Mapper
public interface PreFileDao  {
    void preFileSave(PreFile preFile);
}