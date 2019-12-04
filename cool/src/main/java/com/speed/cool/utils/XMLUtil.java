package com.speed.cool.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.xml.XMLSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

//import net.sf.json.JSONObject;
@Slf4j
@Component
public class XMLUtil {
    static private Logger logger = LoggerFactory.getLogger(XMLUtil.class);
    public JSONObject readStringXml(String xml, String num) {
        String str = "";
        XMLSerializer xmlSerializer = new XMLSerializer();
        //将xml转化为json
        try {
            URLDecoder.decode(xml, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            logger.error("转码异常！");
        }
        String result = xmlSerializer.read(xml).toString();
        JSONObject jsonObject = (JSONObject) JSONObject.parse(result);
        logger.info(jsonObject.toString());
        String jsonObject1 = jsonObject.getString("soap:Body");
        JSONObject jsonObject2 = JSONObject.parseObject(jsonObject1);
        if (num.equals("1")) str = "ns2:ygdyServiceResponse";
        if (num.equals("2")) str = "ns2:ygdjServiceResponse";
        if (num.equals("3")) str = "ns2:ygzxServiceResponse";
        if (num.equals("4")) str = "ns2:wwsqServiceResponse";
        if (num.equals("5")) str = "ns2:sendServiceResponse";
        if (num.equals("6")) str = "ns2:ygydhbdjServiceResponse";
        if (num.equals("7")) str = "ns2:yzxdjServiceResponse";
        if (num.equals("8")) str = "ns2:spfzydjServiceResponse";
        if (num.equals("9")) str = "ns2:esfzydjServiceResponse";
        if (num.equals("10")) str = "ns2:dyqdjServiceResponse";
        if (num.equals("11")) str = "ns2:dyqzxServiceResponse";


        JSONArray object = JSONObject.parseArray(JSONObject.parseObject(jsonObject2.getString(str)).getString("return"));
//        logger.info(object.toString());
        JSONObject myjObject = null;
        logger.info(object.get(0).toString());
        for (int i = 0; i < object.size(); i++) {
            myjObject = object.getJSONObject(i);
            logger.info(myjObject.toString());
        }
        System.out.println("---------------------------");
        return myjObject;
    }

    /**
     *
     */
    public static void main(String[] args) {
        String cn = "你";
        System.out.println(cnToUnicode(cn));
        // 字符串 : \u5f00\u59cb\u4efb\u52a1 ，由于 \ 在java里是转义字符，要写出下面这种形式
        String unicode = "\\u4f60";
        System.out.println(unicodeToCn(unicode));
    }

    public static String unicodeToCn(String unicode) {
        /** 以 \ u 分割，因为java注释也能识别unicode，因此中间加了一个空格*/
        String[] strs = unicode.split("\\\\u");
        String returnStr = "";
        // 由于unicode字符串以 \ u 开头，因此分割出的第一个字符是""。
        for (int i = 1; i < strs.length; i++) {
            returnStr += (char) Integer.valueOf(strs[i], 16).intValue();
        }
        return returnStr;
    }

    private static String cnToUnicode(String cn) {
        char[] chars = cn.toCharArray();
        String returnStr = "";
        for (int i = 0; i < chars.length; i++) {
            returnStr += "\\u" + Integer.toString(chars[i], 16);
        }
        return returnStr;
    }


}
