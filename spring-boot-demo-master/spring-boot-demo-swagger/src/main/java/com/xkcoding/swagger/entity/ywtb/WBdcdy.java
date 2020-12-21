package com.xkcoding.swagger.entity.ywtb;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 不动产情况表(WBdcdy)实体类
 *
 * @author makejava
 * @since 2020-11-30 16:31:15
 */

@Data
public class WBdcdy implements Serializable {
    private static final long serialVersionUID = 507554450362834734L;
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
     * 主键
     */
    private String id;
    /**
     * 业务号
     */
    private String wywh;
    /**
     * 不动产单元号
     */
    private String bdcdyh;
    /**
     * 不动产类型
     */
    private String bdclx;
    /**
     * 宗地/宗海面积
     */
    private Double zdzhmj;
    /**
     * 宗地/宗海用途
     */
    private String zdzhyt;
    /**
     * 定着物面积
     */
    private Double dzwmj;
    /**
     * 套内面积
     */
    private Double tnmj;
    /**
     * 使用开始期限
     */
    private Date syksqx;
    /**
     * 使用结束期限
     */
    private Date syjsqx;
    /**
     * 定着物用途
     */
    private String dzwyt;
    /**
     * 宗地/宗海权利性质
     */
    private String zdzhqlxz;
    /**
     * 用海类型
     */
    private String yhlx;
    /**
     * 构筑物类型
     */
    private String gzwlx;
    /**
     * 林种
     */
    private String lz;
    /**
     * 原不动产权证书号
     */
    private String ybdcqzsh;
    /**
     * 主房不动产单元号
     */
    private String zfbdcdyh;

    public WBdcdy(String createdBy, Date createdTime, String updatedBy, Date updatedTime, String id, String wywh, String bdcdyh, String bdclx, Double zdzhmj, String zdzhyt, Double dzwmj, Double tnmj, Date syksqx, Date syjsqx, String dzwyt, String zdzhqlxz, String yhlx, String gzwlx, String lz, String ybdcqzsh, String zfbdcdyh) {
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.id = id;
        this.wywh = wywh;
        this.bdcdyh = bdcdyh;
        this.bdclx = bdclx;
        this.zdzhmj = zdzhmj;
        this.zdzhyt = zdzhyt;
        this.dzwmj = dzwmj;
        this.tnmj = tnmj;
        this.syksqx = syksqx;
        this.syjsqx = syjsqx;
        this.dzwyt = dzwyt;
        this.zdzhqlxz = zdzhqlxz;
        this.yhlx = yhlx;
        this.gzwlx = gzwlx;
        this.lz = lz;
        this.ybdcqzsh = ybdcqzsh;
        this.zfbdcdyh = zfbdcdyh;
    }

    public WBdcdy() {
    }
}
