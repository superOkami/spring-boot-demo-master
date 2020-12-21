package com.xkcoding.swagger.entity.ywtb;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 异议登记表(WYydj)实体类
 *
 * @author makejava
 * @since 2020-11-25 10:51:08
 */
@Data
public class WYydj implements Serializable {
    private static final long serialVersionUID = -93817402134580597L;
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
     * 异议信息表ID
     */
    private String id;
    /**
     * 业务号
     */
    private String wywh;
    /**
     * 异议事项
     */
    private String yysx;
    /**
     * 不动产登记证明号
     */
    private String bdcdjzmh;
    /**
     * 注销异议业务号
     */
    private String zxyyywh;
    /**
     * 注销异议原因
     */
    private String zxyyyy;


    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWywh() {
        return wywh;
    }

    public void setWywh(String wywh) {
        this.wywh = wywh;
    }

    public String getYysx() {
        return yysx;
    }

    public void setYysx(String yysx) {
        this.yysx = yysx;
    }

    public String getBdcdjzmh() {
        return bdcdjzmh;
    }

    public void setBdcdjzmh(String bdcdjzmh) {
        this.bdcdjzmh = bdcdjzmh;
    }

    public String getZxyyywh() {
        return zxyyywh;
    }

    public void setZxyyywh(String zxyyywh) {
        this.zxyyywh = zxyyywh;
    }

    public String getZxyyyy() {
        return zxyyyy;
    }

    public void setZxyyyy(String zxyyyy) {
        this.zxyyyy = zxyyyy;
    }

}
