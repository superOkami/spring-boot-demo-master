package com.xkcoding.swagger.entity;

import com.xkcoding.swagger.entity.ywtb.WFile;
import lombok.Data;


/**
 * @ClassName: WFileModel
 * @Description: 附件入参模型
 * @Date: 2020-12-16 16:47
 * @Author: Mzw
 * @Version: 1.0
 */
@Data
public class WFileModel extends WFile {

    /**
     * Blob附件
     */
    private String fileBlob;

    public WFileModel() {
    }
}
