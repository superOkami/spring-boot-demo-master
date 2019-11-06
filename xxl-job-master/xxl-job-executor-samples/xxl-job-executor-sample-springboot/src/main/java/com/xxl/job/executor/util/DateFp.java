package com.xxl.job.executor.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：wj
 * @date ：Created in 2019/11/5 17:51
 * @description：
 * @modified By：
 * @version: version
 */
public class DateFp {

    public static Date parse(String param){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
             date = sdf.parse(param);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
