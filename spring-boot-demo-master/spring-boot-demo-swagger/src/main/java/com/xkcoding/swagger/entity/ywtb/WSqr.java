package com.xkcoding.swagger.entity.ywtb;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 申请人(包含权利人和义务人)(WSqr)实体类
 *
 * @author makejava
 * @since 2020-11-25 10:51:05
 */
@Data
public class WSqr implements Serializable {
    private static final long serialVersionUID = 835385256993752878L;
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
    private Long bsm;
    /**
     * 业务号
     */
    private String ywh;
    /**
     * 名称
     */
    private String mc;
    /**
     * 顺序号
     */
    private Double sxh;
    /**
     * 证件种类(字典)
     */
    private String zjzl;
    /**
     * 证件号
     */
    private String zjh;
    /**
     * 通讯地址
     */
    private String txdz;
    /**
     * 邮编
     */
    private String yb;
    /**
     * 法人名称
     */
    private String frmc;
    /**
     * 法人电话
     */
    private String frdh;
    /**
     * 法人证件类型
     */
    private String frdbzjlx;
    /**
     * 法人证件号
     */
    private String frdbzjh;
    /**
     * 代理人名称
     */
    private String dlrmc;
    /**
     * 代理人电话
     */
    private String dlrdh;
    /**
     * 代理机构
     */
    private String dlrjg;
    /**
     * 代理人证件类型
     */
    private String dlrzjlx;
    /**
     * 代理人证件号
     */
    private String dlrzjh;
    /**
     * 权利比例
     */
    private String qlbl;
    /**
     * 共有情况
     */
    private String gyqk;
    /**
     * 性别
     */
    private String xb;
    /**
     * 电话
     */
    private String dh;
    /**
     * 备注
     */
    private String bz;
    /**
     * 共有方式(字典)
     */
    private String gyfs;
    /**
     * 是否持证人
     */
    private String sfczr;
    /**
     * 电子邮件
     */
    private String dzyj;
    /**
     * 申请人类型
     */
    private String sqrlx;
    /**
     * 国家/地区
     */
    private String gj;
    /**
     * 户籍所在省市(字典)
     */
    private String hjszss;
    /**
     * 所属行业(字典)
     */
    private String sshy;
    /**
     * 工作单位
     */
    private String gzdw;
    /**
     * 申请人类别(权利人：2  义务人 ：1    抵押权人 5   查封单位 ： 3)
     */
    private String sqrlb;
    /**
     * 不动产权证号
     */
    private String bdcqzh;

    public WSqr(String createdBy, Date createdTime, String updatedBy, Date updatedTime, Long bsm, String ywh, String mc, Double sxh, String zjzl, String zjh, String txdz, String yb, String frmc, String frdh, String frdbzjlx, String frdbzjh, String dlrmc, String dlrdh, String dlrjg, String dlrzjlx, String dlrzjh, String qlbl, String gyqk, String xb, String dh, String bz, String gyfs, String sfczr, String dzyj, String sqrlx, String gj, String hjszss, String sshy, String gzdw, String sqrlb, String bdcqzh) {
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.bsm = bsm;
        this.ywh = ywh;
        this.mc = mc;
        this.sxh = sxh;
        this.zjzl = zjzl;
        this.zjh = zjh;
        this.txdz = txdz;
        this.yb = yb;
        this.frmc = frmc;
        this.frdh = frdh;
        this.frdbzjlx = frdbzjlx;
        this.frdbzjh = frdbzjh;
        this.dlrmc = dlrmc;
        this.dlrdh = dlrdh;
        this.dlrjg = dlrjg;
        this.dlrzjlx = dlrzjlx;
        this.dlrzjh = dlrzjh;
        this.qlbl = qlbl;
        this.gyqk = gyqk;
        this.xb = xb;
        this.dh = dh;
        this.bz = bz;
        this.gyfs = gyfs;
        this.sfczr = sfczr;
        this.dzyj = dzyj;
        this.sqrlx = sqrlx;
        this.gj = gj;
        this.hjszss = hjszss;
        this.sshy = sshy;
        this.gzdw = gzdw;
        this.sqrlb = sqrlb;
        this.bdcqzh = bdcqzh;
    }

    public WSqr() {
    }
}
