package com.xkcoding.swagger.entity.ywtb;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 收费表(WSf)实体类
 *
 * @author makejava
 * @since 2020-11-25 10:51:02
 */
@Data
public class WSf implements Serializable {
    private static final long serialVersionUID = 449154124359387449L;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新人
     */
    private String updatedBy;
    /**
     * 更新时间
     */
    private Date updatedTime;
    /**
     * 标识码
     */
    private Long bsm;
    /**
     * 业务号
     */
    private String wywh;
    /**
     * 计费日期
     */
    private Date jfrq;
    /**
     * 应收金额
     */
    private Double ysje;
    /**
     * 折扣后应收金额
     */
    private Double zkhysje;
    /**
     * 收费人员
     */
    private String sfry;
    /**
     * 收费日期
     */
    private Date sfrq;
    /**
     * 实收金额
     */
    private Double ssje;
    /**
     * 状态
     */
    private String zt;
    /**
     * 备注
     */
    private String bz;

}
