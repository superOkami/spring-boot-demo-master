package com.xkcoding.swagger.entity.ywtb;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 收件材料文件(WFile)实体类
 *
 * @author makejava
 * @since 2020-11-25 10:50:55
 */
@Data
public class WFile implements Serializable {
    private static final long serialVersionUID = -28152139303864834L;
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
     * 文件夹id
     */
    private String folderBsm;
    /**
     * 名称
     */
    private String fileName;
    /**
     * 大小
     */
    private Double fileSize;
    /**
     * 内网保存路径
     */
    private String fileUrl;
    /**
     * 扩展名 .jpg/.png ....
     */
    private String fileExtension;

    /**
     * 备注
     */
    private String bz;

}
