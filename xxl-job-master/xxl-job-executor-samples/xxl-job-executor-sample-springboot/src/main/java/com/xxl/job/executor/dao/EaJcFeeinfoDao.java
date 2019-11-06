package com.xxl.job.executor.dao;

import com.xxl.job.executor.model.EaJcFeeinfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Auto created by codeAppend plugin
 */
@Mapper
public interface EaJcFeeinfoDao  {
    void eaJcFeeinfoSave(EaJcFeeinfo eaJcFeeinfo);
}