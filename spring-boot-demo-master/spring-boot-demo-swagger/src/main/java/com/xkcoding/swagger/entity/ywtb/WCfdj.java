package com.xkcoding.swagger.entity.ywtb;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 查封登记表(WCfdj)实体类
 *
 * @author makejava
 * @since 2020-11-25 10:50:51
 */
@Data
public class WCfdj implements Serializable {
    private static final long serialVersionUID = -24202521509785702L;
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
     * 查封信息表ID
     */
    private String id;
    /**
     * 业务号
     */
    private String wywh;
    /**
     * 查封类型
     */
    private String cflx;
    /**
     * 查封文件
     */
    private String cfwj;
    /**
     * 查封文号
     */
    private String cfwh;
    /**
     * 查封起始时间
     */
    private Date cfqssj;
    /**
     * 查封结束时间
     */
    private Date cfjssj;
    /**
     * 查封范围
     */
    private String cffw;
    /**
     * 上次业务号（之前有过查封的案件号）
     */
    private String scywh;
    /**
     * 解封业务号
     */
    private String jfywh;
    /**
     * 解封机关
     */
    private String jfjg;
    /**
     * 解封文件
     */
    private String jfwj;
    /**
     * 解封文号
     */
    private String jfwh;


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

    public String getCflx() {
        return cflx;
    }

    public void setCflx(String cflx) {
        this.cflx = cflx;
    }

    public String getCfwj() {
        return cfwj;
    }

    public void setCfwj(String cfwj) {
        this.cfwj = cfwj;
    }

    public String getCfwh() {
        return cfwh;
    }

    public void setCfwh(String cfwh) {
        this.cfwh = cfwh;
    }

    public Date getCfqssj() {
        return cfqssj;
    }

    public void setCfqssj(Date cfqssj) {
        this.cfqssj = cfqssj;
    }

    public Date getCfjssj() {
        return cfjssj;
    }

    public void setCfjssj(Date cfjssj) {
        this.cfjssj = cfjssj;
    }

    public String getCffw() {
        return cffw;
    }

    public void setCffw(String cffw) {
        this.cffw = cffw;
    }

    public String getScywh() {
        return scywh;
    }

    public void setScywh(String scywh) {
        this.scywh = scywh;
    }

    public String getJfywh() {
        return jfywh;
    }

    public void setJfywh(String jfywh) {
        this.jfywh = jfywh;
    }

    public String getJfjg() {
        return jfjg;
    }

    public void setJfjg(String jfjg) {
        this.jfjg = jfjg;
    }

    public String getJfwj() {
        return jfwj;
    }

    public void setJfwj(String jfwj) {
        this.jfwj = jfwj;
    }

    public String getJfwh() {
        return jfwh;
    }

    public void setJfwh(String jfwh) {
        this.jfwh = jfwh;
    }

}
