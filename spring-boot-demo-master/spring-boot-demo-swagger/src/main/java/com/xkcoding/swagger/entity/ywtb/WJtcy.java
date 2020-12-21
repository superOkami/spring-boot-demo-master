package com.xkcoding.swagger.entity.ywtb;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 家庭成员表(WJtcy)实体类
 *
 * @author makejava
 * @since 2020-11-25 10:51:00
 */
@Data
public class WJtcy implements Serializable {
    private static final long serialVersionUID = 931331338322827159L;
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
     * 家庭成员ID
     */
    private String id;
    /**
     * 家庭成员姓名
     */
    private String mc;
    /**
     * 家庭成员证件类型
     */
    private String zjlx;
    /**
     * 家庭成员证件号码
     */
    private String zjh;
    /**
     * 家庭成员性别
     */
    private String xb;
    /**
     * 家庭成员类型
     */
    private String lx;
    /**
     * 业务号
     */
    private String wywh;


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

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    public String getZjh() {
        return zjh;
    }

    public void setZjh(String zjh) {
        this.zjh = zjh;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getWywh() {
        return wywh;
    }

    public void setWywh(String wywh) {
        this.wywh = wywh;
    }

}
