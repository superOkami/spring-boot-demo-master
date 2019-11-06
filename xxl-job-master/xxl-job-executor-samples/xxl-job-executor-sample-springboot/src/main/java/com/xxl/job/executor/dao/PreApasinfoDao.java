package com.xxl.job.executor.dao;

import com.xxl.job.executor.model.PreApasinfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Auto created by codeAppend plugin
 */
@Mapper
public interface PreApasinfoDao  {
    void preApasinfoSave(PreApasinfo preApasinfo);
}