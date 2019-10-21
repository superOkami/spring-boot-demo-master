package com.speed.cool.utils;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class WebserviceUtil {
    private static String serviceUrl;
    private static String fgServiceUrl;

    @Value("${realEstate.service.url}")
    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    //    @Value("${realEstate.fg.service.url}")
//    public void setFgServiceUrl(String serviceUrl)
//    {
//        this.fgServiceUrl = serviceUrl;
//    }
    private static String GET = "GET";
    private static String POST = "POST";

    //通过不动产证明号查询不动产信息（预抵登记）
    public static String GET_BDC_YDXX = "/realEstate/web/cx/getBdcYdyxx";

    /**
     * 不动产检验
     */
//    public static String CHECK_BDC_EFFECTIVITY = "checkBdcEffectivity";

//    public static String CHECK_PAYMENT = "realEstate/web/yw/checkPayment";
    private WebserviceUtil() {
    }

    private static String sendRequest(String method, String requestMethod, String params) {
        OutputStream out = null; //写
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(Calendar.getInstance().getTime()));
        HttpURLConnection connection = null;
        InputStream is = null;
        BufferedReader br = null;
        String result = null;// 返回结果字符串
        try {
            // 创建远程url连接对象
            URL url = new URL(serviceUrl + method);
            // 通过远程url连接对象打开一个连接，强转成httpURLConnection类
            connection = (HttpURLConnection) url.openConnection();
            // 设置连接方式：get
            connection.setRequestMethod(requestMethod);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            // 设置连接主机服务器的超时时间：15000毫秒
            connection.setConnectTimeout(5000);
            // 设置读取远程返回的数据时间：60000毫秒
            connection.setReadTimeout(6000000);
            //获取输出流
            OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
            //输出流里写入POST参数
            osw.write(params);
            osw.flush();
            osw.close();

            // 通过connection连接，获取输入流
            if (connection.getResponseCode() == 200) {
                is = connection.getInputStream();
                // 封装输入流is，并指定字符集
                br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                // 存放数据
                StringBuffer sbf = new StringBuffer();
                String temp = null;
                while ((temp = br.readLine()) != null) {
                    sbf.append(temp);
                    sbf.append("\r\n");
                }
                result = sbf.toString();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            connection.disconnect();// 关闭远程连接

        }
        System.out.println(sdf.format(Calendar.getInstance().getTime()));
        System.out.println(result);

        return result;
    }

    public static String sendRequest(String method, String params) {
        return sendRequest(method, POST, params);
    }

    public static String post(String method, String params) {
        return sendRequest(method, POST, params);
    }

    public String get(String method, String params) {
        return sendRequest(method, GET, params);
    }

    public static String post(String method, Map<String, String> params) {
        return sendRequest(serviceUrl, method, POST, params);
    }

    public String get(String method, Map<String, String> params) {
        return sendRequest(serviceUrl, method, GET, params);
    }

    private static String sendRequest(String serviceUrl, String method, String requestMethod, Map<String, String> params) {
        System.out.println(method + "|" + params);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("调用时间：" + sdf.format(Calendar.getInstance().getTime()));

        StringBuilder sb = new StringBuilder();

        if (params != null && !params.isEmpty()) {
            for (Map.Entry<String, String> e : params.entrySet()) {
                sb.append(e.getKey()).append("=").append(e.getValue()).append("&");
            }
            sb.substring(0, sb.length() - 1);
        }

        OutputStream out = null; //写
        String requestUrl = serviceUrl + method;
        HttpURLConnection connection = null;

        InputStream is = null;  // 读
        BufferedReader br = null;
        String result = null;// 返回结果字符串
        try {
            // 创建远程url连接对象
            URL url = new URL(requestUrl);
            // 通过远程url连接对象打开一个连接，强转成httpURLConnection类
            connection = (HttpURLConnection) url.openConnection();
            // 设置连接方式：get
            connection.setRequestMethod(requestMethod);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            // 设置连接主机服务器的超时时间：15000毫秒
            connection.setConnectTimeout(15000);
            // 设置读取远程返回的数据时间：60000毫秒
            connection.setReadTimeout(60000);

            //获取输出流
            OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
            //输出流里写入POST参数
            osw.write(sb.toString());
            osw.flush();
            osw.close();

            // 通过connection连接，获取输入流
            if (connection.getResponseCode() == 200) {
                is = connection.getInputStream();
                // 封装输入流is，并指定字符集
                br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                // 存放数据
                StringBuffer sbf = new StringBuffer();
                String temp = null;
                while ((temp = br.readLine()) != null) {
                    sbf.append(temp);
                    sbf.append("\r\n");
                }
                result = sbf.toString();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            connection.disconnect();// 关闭远程连接

        }

        return result;
    }

    public static String sendRequest(String method, Map<String, String> params) {
        return sendRequest(serviceUrl, method, POST, params);
    }

    public static String sendRequest4Fg(String method, Map<String, String> params) {
        return sendRequest(fgServiceUrl, method, GET, params);
    }

    // 构建唯一会话Id
    public static String getSessionId() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        return str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
    }

    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("bdcdyh", "371602009009GB00002F00072032");
        System.out.println(WebserviceUtil.sendRequest("hlwjqlr", params));
    }
}
