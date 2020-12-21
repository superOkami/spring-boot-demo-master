package com.xkcoding.swagger.entity;

import lombok.Data;

/**
 * @ClassName: StatusModel
 * @Description: 状态同步模型
 * @Date: 2020-11-19 12:04
 * @Author: Mzw
 * @Version: 1.0
 */
@Data
public class StatusModel {

    /**
     * 业务流水号
     */
    private String wywh;
    /**
     * 受理编号
     */
    private String nwywh;
    /**
     * 0 未提交 1已提交 2办理中 3已办结 4 已终止 5 已退回
     */
    private Integer blzt;
    /**
     * 退、撤件办理意见
     */
    private String blyj;
    /**
     * 状态值 0 待受理 ，1 已受理，2 已办结 ，4 撤件 ，99 退件
     */
    private String i2oZt;
}
