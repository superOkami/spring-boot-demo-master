package com.xkcoding.swagger.entity;

import com.xkcoding.swagger.entity.ywtb.WSqr;
import lombok.Data;

/**
 * @ClassName: WSqrModel
 * @Description: 申请人入参模型
 * @Date: 2020-11-26 15:08
 * @Author: Mzw
 * @Version: 1.0
 */

@Data
public class WSqrModel {
    /**
     * 申请人信息
     */
    private WSqr sqr;

    /**
     * 人员照片
     */
    private String zp;
}
