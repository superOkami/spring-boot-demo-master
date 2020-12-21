package com.xkcoding.swagger.entity.ywtb;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 合同信息表(WHtxx)实体类
 *
 * @author makejava
 * @since 2020-11-25 10:50:58
 */
@Data
public class WHtxx implements Serializable {
    private static final long serialVersionUID = -91340290549285721L;
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
     * 主键id
     */
    private String id;
    /**
     * 交易价格
     */
    private Double jyjg;
    /**
     * 合同金额
     */
    private Double htje;
    /**
     * 合同签订日期
     */
    private Date htqdrq;
    /**
     * 交易时间
     */
    private Date jysj;
    /**
     * 单价
     */
    private Double dj;
    /**
     * 当期应收款金额
     */
    private Double yskje;
    /**
     * 当期应收税款所属月份
     */
    private Date ssyf;
    /**
     * 上次房产交易价格
     */
    private Double scjyjg;
    /**
     * 业务号
     */
    private String wywh;
    /**
     * 交易合同号
     */
    private String jyhth;


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

    public Double getJyjg() {
        return jyjg;
    }

    public void setJyjg(Double jyjg) {
        this.jyjg = jyjg;
    }

    public Double getHtje() {
        return htje;
    }

    public void setHtje(Double htje) {
        this.htje = htje;
    }

    public Date getHtqdrq() {
        return htqdrq;
    }

    public void setHtqdrq(Date htqdrq) {
        this.htqdrq = htqdrq;
    }

    public Date getJysj() {
        return jysj;
    }

    public void setJysj(Date jysj) {
        this.jysj = jysj;
    }

    public Double getDj() {
        return dj;
    }

    public void setDj(Double dj) {
        this.dj = dj;
    }

    public Double getYskje() {
        return yskje;
    }

    public void setYskje(Double yskje) {
        this.yskje = yskje;
    }

    public Date getSsyf() {
        return ssyf;
    }

    public void setSsyf(Date ssyf) {
        this.ssyf = ssyf;
    }

    public Double getScjyjg() {
        return scjyjg;
    }

    public void setScjyjg(Double scjyjg) {
        this.scjyjg = scjyjg;
    }

    public String getWywh() {
        return wywh;
    }

    public void setWywh(String wywh) {
        this.wywh = wywh;
    }

    public String getJyhth() {
        return jyhth;
    }

    public void setJyhth(String jyhth) {
        this.jyhth = jyhth;
    }

    public WHtxx(String createdBy, Date createdTime, String updatedBy, Date updatedTime, String id, Double jyjg, Double htje, Date htqdrq, Date jysj, Double dj, Double yskje, Date ssyf, Double scjyjg, String wywh, String jyhth) {
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.id = id;
        this.jyjg = jyjg;
        this.htje = htje;
        this.htqdrq = htqdrq;
        this.jysj = jysj;
        this.dj = dj;
        this.yskje = yskje;
        this.ssyf = ssyf;
        this.scjyjg = scjyjg;
        this.wywh = wywh;
        this.jyhth = jyhth;
    }

    public WHtxx() {
    }
}
