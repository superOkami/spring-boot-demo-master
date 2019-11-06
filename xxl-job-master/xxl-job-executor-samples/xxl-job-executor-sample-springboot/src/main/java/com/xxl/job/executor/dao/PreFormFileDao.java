package com.xxl.job.executor.dao;

import com.xxl.job.executor.model.PreFormFile;
import org.apache.ibatis.annotations.Mapper;

/**
 * Auto created by codeAppend plugin
 */
@Mapper
public interface PreFormFileDao  {
    void preFormFileSave(PreFormFile preFormFile);
}