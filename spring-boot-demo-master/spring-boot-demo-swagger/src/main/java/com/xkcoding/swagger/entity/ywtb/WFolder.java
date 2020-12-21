package com.xkcoding.swagger.entity.ywtb;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 收件材料目录表(WFolder)实体类
 *
 * @author makejava
 * @since 2020-11-25 10:50:57
 */
@Data
public class WFolder implements Serializable {
    private static final long serialVersionUID = -34633058031825077L;
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
     * 名称
     */
    private String mc;
    /**
     * 页数
     */
    private Integer ys;
    /**
     * 序号 -- 内网附件材料编码
     */
    private Integer xh;
    /**
     * 备注
     */
    private String bz;


}
