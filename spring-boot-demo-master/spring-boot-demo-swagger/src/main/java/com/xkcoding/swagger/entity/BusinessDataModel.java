package com.xkcoding.swagger.entity;

import com.xkcoding.swagger.entity.ywtb.*;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: BusinessDataModel
 * @Description: 数据库梳理后提交业务数据模型
 * @Date: 2020-11-24 18:05
 * @Author: Mzw
 * @Version: 1.0
 */

@Data
public class BusinessDataModel {

    /**
     * 受理申请信息
     */
    private WSlsq slsq;
    /**
     * 申请人信息
     */
    private List<WSqrModel> sqrList;
    /**
     * 不动产信息
     */
    private List<WBdcdy> bdcdys;
    /**
     * 合同信息
     */
    private WHtxx htxx;
    /**
     * 抵押权信息
     */
    private List<WDyaq> dyaqs;
    /**
     * 家庭成员信息
     */
    private List<WJtcy> jtcys;
    /**
     * 异议登记信息
     */
    private WYydj yydj;
    /**
     * 查封登记信息
     */
    private WCfdj cfdj;
    /**
     * 文件目录集合
     */
    private List<WFolder> folders;
    /**
     * 文件集合
     */
    private List<WFileModel> files;




}
