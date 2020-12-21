package com.xkcoding.swagger.entity.ywtb;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 受理申请(WSlsq)实体类
 *
 * @author makejava
 * @since 2020-11-25 10:51:03
 */
@Data
public class WSlsq implements Serializable {
    private static final long serialVersionUID = -62799084871042627L;
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
     * 业务号
     */
    private String wywh;
    /**
     * 内网业务号
     */
    private String nwywh;
    /**
     * 流程首字母拼写
     */
    private String djlx;
    /**
     * 申请证书版式
     */
    private Integer sqzsbs;
    /**
     * 申请分别持证
     */
    private Integer sqfbcz;
    /**
     * 审核人
     */
    private String shry;
    /**
     * 审核时间
     */
    private Date shsj;
    /**
     * 审核意见
     */
    private String shyj;
    /**
     * 坐落
     */
    private String zl;
    /**
     * 受否邮寄
     */
    private String sfyj;
    /**
     * 登记原因
     */
    private String djyy;
    /**
     * 备注
     */
    private String bz;
    /**
     * 不动产单元号
     */
    private String bdcdyh;
    /**
     * 是否灭失
     */
    private String sfms;
    /**
     * 0 未提交 1已提交 2办理中 3已办结 4 已终止 5 已退回
     */
    private Integer blzt;
    /**
     * 外网至内网同步状态
     */
    private String o2iZt;
    /**
     * 内网至外网同步状态
     */
    private String i2oZt;
    /**
     * 0 一网通办（互联网案件），1 一链办， 2 政务网（一窗受理），终端机
     */
    private String ywly;
    /**
     * 1、PC；2、APP；3、微信
     */
    private String khdlx;

    public WSlsq() {

    }

    public WSlsq(String createdBy, Date createdTime, String updatedBy, Date updatedTime, String wywh, String nwywh, String djlx, Integer sqzsbs, Integer sqfbcz, String shry, Date shsj, String shyj, String zl, String sfyj, String djyy, String bz, String bdcdyh, String sfms, Integer blzt, String o2iZt, String i2oZt, String ywly, String khdlx) {
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.wywh = wywh;
        this.nwywh = nwywh;
        this.djlx = djlx;
        this.sqzsbs = sqzsbs;
        this.sqfbcz = sqfbcz;
        this.shry = shry;
        this.shsj = shsj;
        this.shyj = shyj;
        this.zl = zl;
        this.sfyj = sfyj;
        this.djyy = djyy;
        this.bz = bz;
        this.bdcdyh = bdcdyh;
        this.sfms = sfms;
        this.blzt = blzt;
        this.o2iZt = o2iZt;
        this.i2oZt = i2oZt;
        this.ywly = ywly;
        this.khdlx = khdlx;
    }
}
