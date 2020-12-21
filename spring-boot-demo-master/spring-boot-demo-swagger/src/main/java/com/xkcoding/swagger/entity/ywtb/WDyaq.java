package com.xkcoding.swagger.entity.ywtb;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 抵押权表(WDyaq)实体类
 *
 * @author makejava
 * @since 2020-11-25 10:50:53
 */
@Data
public class WDyaq implements Serializable {
    private static final long serialVersionUID = -43088300820407016L;
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
     * 抵押信息表ID
     */
    private String id;
    /**
     * 业务号
     */
    private String wywh;
    /**
     * 抵押方式
     */
    private String dyfs;
    /**
     * 在建建筑物抵押范围
     */
    private String zjjzwdyfw;
    /**
     * 被担保主债权数额(万元)
     */
    private String bdbzzqse;
    /**
     * 最高债权数额(万元)
     */
    private String zgzqse;
    /**
     * 债务履行起始时间
     */
    private Date zwlxqssj;
    /**
     * 债务履行结束时间
     */
    private Date zwlxjssj;
    /**
     * 抵押权顺位
     */
    private String dyqsw;
    /**
     * 是否预告登记
     */
    private String sfygdj;
    /**
     * 不动产登记证明号
     */
    private String bdcdjzmh;
    /**
     * 注销抵押业务号
     */
    private String zxdyywh;
    /**
     * 注销抵押原因
     */
    private String zxdyyy;


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

    public String getDyfs() {
        return dyfs;
    }

    public void setDyfs(String dyfs) {
        this.dyfs = dyfs;
    }

    public String getZjjzwdyfw() {
        return zjjzwdyfw;
    }

    public void setZjjzwdyfw(String zjjzwdyfw) {
        this.zjjzwdyfw = zjjzwdyfw;
    }

    public String getBdbzzqse() {
        return bdbzzqse;
    }

    public void setBdbzzqse(String bdbzzqse) {
        this.bdbzzqse = bdbzzqse;
    }

    public String getZgzqse() {
        return zgzqse;
    }

    public void setZgzqse(String zgzqse) {
        this.zgzqse = zgzqse;
    }

    public Date getZwlxqssj() {
        return zwlxqssj;
    }

    public void setZwlxqssj(Date zwlxqssj) {
        this.zwlxqssj = zwlxqssj;
    }

    public Date getZwlxjssj() {
        return zwlxjssj;
    }

    public void setZwlxjssj(Date zwlxjssj) {
        this.zwlxjssj = zwlxjssj;
    }

    public String getDyqsw() {
        return dyqsw;
    }

    public void setDyqsw(String dyqsw) {
        this.dyqsw = dyqsw;
    }

    public String getSfygdj() {
        return sfygdj;
    }

    public void setSfygdj(String sfygdj) {
        this.sfygdj = sfygdj;
    }

    public String getBdcdjzmh() {
        return bdcdjzmh;
    }

    public void setBdcdjzmh(String bdcdjzmh) {
        this.bdcdjzmh = bdcdjzmh;
    }

    public String getZxdyywh() {
        return zxdyywh;
    }

    public void setZxdyywh(String zxdyywh) {
        this.zxdyywh = zxdyywh;
    }

    public String getZxdyyy() {
        return zxdyyy;
    }

    public void setZxdyyy(String zxdyyy) {
        this.zxdyyy = zxdyyy;
    }

}
