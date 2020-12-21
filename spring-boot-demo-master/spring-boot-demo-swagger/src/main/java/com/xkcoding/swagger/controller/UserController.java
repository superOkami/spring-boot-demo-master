package com.xkcoding.swagger.controller;

import com.alibaba.fastjson.JSONObject;
//import cn.hutool.json.JSONObject;
import com.xkcoding.swagger.common.ApiResponse;
import com.xkcoding.swagger.common.DataType;
import com.xkcoding.swagger.common.ParamType;
import com.xkcoding.swagger.entity.BusinessDataModel;
import com.xkcoding.swagger.entity.User;
import com.xkcoding.swagger.entity.WFileModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * User Controller
 * </p>
 *
 * @package: com.xkcoding.swagger.controller
 * @description: User Controller
 * @author: yangkai.shen
 * @date: Created in 2018-11-29 11:30
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@RestController
@RequestMapping("/user")
@Api(tags = "1.0.0-SNAPSHOT", description = "用户管理", value = "用户管理")
@Slf4j
public class UserController {
    @GetMapping
    @ApiOperation(value = "条件查询（DONE）", notes = "备注")
    @ApiImplicitParams({@ApiImplicitParam(name = "username", value = "用户名", dataType = DataType.STRING, paramType = ParamType.QUERY, defaultValue = "xxx")})
    public ApiResponse<User> getByUserName(String username) {
        log.info("多个参数用  @ApiImplicitParams");
        return ApiResponse.<User>builder().code(200)
                .message("操作成功")
                .data(new User(1, username, "JAVA"))
                .build();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "主键查询（DONE）", notes = "备注")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "用户编号", dataType = DataType.INT, paramType = ParamType.PATH)})
    public ApiResponse<User> get(@PathVariable Integer id) {
        log.info("单个参数用  @ApiImplicitParam");
        return ApiResponse.<User>builder().code(200)
                .message("操作成功")
                .data(new User(id, "u1", "p1"))
                .build();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除用户（DONE）", notes = "备注")
    @ApiImplicitParam(name = "id", value = "用户编号", dataType = DataType.INT, paramType = ParamType.PATH)
    public void delete(@PathVariable Integer id) {
        log.info("单个参数用 ApiImplicitParam");
    }

    @PostMapping
    @ApiOperation(value = "添加用户（DONE）")
    public User post(@RequestBody User user) {
        log.info("如果是 POST PUT 这种带 @RequestBody 的可以不用写 @ApiImplicitParam");
        return user;
    }

    @PostMapping("/multipar")
    @ApiOperation(value = "添加用户（DONE）")
    public List<User> multipar(@RequestBody List<User> user) {
        log.info("如果是 POST PUT 这种带 @RequestBody 的可以不用写 @ApiImplicitParam");

        return user;
    }

    @PostMapping("/array")
    @ApiOperation(value = "添加用户（DONE）")
    public User[] array(@RequestBody User[] user) {
        log.info("如果是 POST PUT 这种带 @RequestBody 的可以不用写 @ApiImplicitParam");
        return user;
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改用户（DONE）")
    public void put(@PathVariable Long id, @RequestBody User user) {
        log.info("如果你不想写 @ApiImplicitParam 那么 swagger 也会使用默认的参数名作为描述信息 ");
    }

    @PostMapping("/{id}/file")
    @ApiOperation(value = "文件上传（DONE）")
    public String file(@PathVariable Long id, @RequestParam("file") MultipartFile file) {
        log.info(file.getContentType());
        log.info(file.getName());
        log.info(file.getOriginalFilename());
        return file.getOriginalFilename();
    }

    @PostMapping(value = "/yw/syncApplicationInfo")
    public String synchronizeApplicationInfo(@RequestBody BusinessDataModel model) {
        return "null";
    }
    @PostMapping(value = "/yw/blobtest")
    public  String synchronizeApplicationInfo2(@RequestBody WFileModel model) {
        String blob = model.getFileBlob();
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(new File("C:\\\\Users\\\\WEGAME\\\\Desktop\\\\78788.jpg"));
            //FileCopyUtils.copy(blob.getBinaryStream(),fileOutputStream);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        //} catch (SQLException throwables) {
        //    throwables.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(12);
        return "null";
    }
     @PostMapping(value = "/yw/ss")
    public String synchronizeApplicationInf1o() throws Exception {
         File file = new File("C:\\Users\\WEGAME\\Desktop\\256.jpg");
         Blob blob = null;
         byte[] bytes = new byte[0];
         try {
             bytes = FileCopyUtils.copyToByteArray(file);
             String str = "好的卡上肯定会";
              blob = new SerialBlob(bytes);
         } catch (IOException e) {
             e.printStackTrace();
         } catch (SerialException throwables) {
             throwables.printStackTrace();
         } catch (SQLException throwables) {
             throwables.printStackTrace();
         }
         WFileModel wFileModel = new WFileModel();
         //wFileModel.setFileBlob(blob);
         wFileModel.setBsm(1L);
         //wFileModel.se
         JSONObject jsonObject = (JSONObject) JSONObject.toJSON(wFileModel);

         String s = sendRequestPost("http://127.0.0.1:5566/demo/user/yw/blobtest",jsonObject.toString());


         return "null";
    }

    public static String sendRequestPost(String url, String params) throws Exception{
        //1、创建httpClient
        CloseableHttpClient client = HttpClients.createDefault();
        //2、创建httpPost请求
        HttpPost httpPost = new HttpPost(url);
        //3、初始化response
        CloseableHttpResponse response = null;
        try {
            StringEntity requestEntity = new StringEntity(params,"UTF-8");
            requestEntity.setContentEncoding("UTF-8");
            httpPost.setHeader("Content-Type","application/x-www-form-urlencoded;charset=UTF-8");
            httpPost.setEntity(requestEntity);
            //执行
            response = client.execute(httpPost);
            String result = EntityUtils.toString(response.getEntity(), "UTF-8");
            if (!StringUtils.isEmpty(result)) {
                return result;
            }
        }catch (Exception e) {
            log.error("POST请求失败！",e);
        }finally {
            response.close();
            client.close();
        }
        return null;
    }

    /**
     * 以流的方式
     * 发送文件和json对象
     *
     * @return
     */
    public static String doPostFileStreamAndJsonObj(String url, List<String> fileList, JSONObject json) {
        String result = "";//请求返回参数
        String jsonString = json.toString();//获得jsonstirng,或者toString都可以，只要是json格式，给了别人能解析成json就行
//        System.out.println("================");
//        System.out.println(xml);//可以打印出来瞅瞅
//        System.out.println("================");
        try {
            //开始设置模拟请求的参数，额，不一个个介绍了，根据需要拿
            String boundary = "------WebKitFormBoundaryUey8ljRiiZqhZHBu";
            URL u = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("connection", "Keep-Alive");
            //这里模拟的是火狐浏览器，具体的可以f12看看请求的user-agent是什么
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Charsert", "UTF-8");
            //这里的content-type要设置成表单格式，模拟ajax的表单请求
            conn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
            // 指定流的大小，当内容达到这个值的时候就把流输出
            conn.setChunkedStreamingMode(10240000);
            //定义输出流，有什么数据要发送的，直接后面append就可以，记得转成byte再append
            OutputStream out = new DataOutputStream(conn.getOutputStream());
            byte[] end_data = ("\r\n--" + boundary + "--\r\n").getBytes();// 定义最后数据分隔线

            StringBuilder sb = new StringBuilder();
            //添加form属性
            sb.append("--");
            sb.append(boundary);
            sb.append("\r\n");
            //这里存放要传输的参数，name = xml
            sb.append("Content-Disposition: form-data; name=\"JsonObj\"");
            sb.append("\r\n\r\n");
            //把要传的json字符串放进来
            sb.append(jsonString);
            out.write(sb.toString().getBytes("utf-8"));
            out.write("\r\n".getBytes("utf-8"));

            int leng = fileList.size();
            for (int i = 0; i < leng; i++) {
                File file = new File(fileList.get(i));
                if(file.exists()){
                    sb = new StringBuilder();
                    sb.append("--");
                    sb.append(boundary);
                    sb.append("\r\n");
                    //这里的参数啥的是我项目里对方接收要用到的，具体的看你的项目怎样的格式
                    sb.append("Content-Disposition: form-data;name=\"File"
                        + "\";filename=\"" + file.getName() + "\"\r\n");
                    //这里拼接个fileName，方便后面用第一种方式接收（如果是纯文件，不带其他参数，就可以不用这个了，因为Multipart可以直接解析文件）
                    sb.append("FileName:"+ file.getName() + "\r\n");
                    //发送文件是以流的方式发送，所以这里的content-type是octet-stream流
                    sb.append("Content-Type:application/octet-stream\r\n\r\n");
                    byte[] data = sb.toString().getBytes();
                    out.write(data);
                    DataInputStream in = new DataInputStream(new FileInputStream(file));
                    int bytes = 0;
                    byte[] bufferOut = new byte[1024];
                    while ((bytes = in.read(bufferOut)) != -1) {
                        out.write(bufferOut, 0, bytes);
                    }
                    int j = i + 1;
                    if (leng > 1 && j != leng) {
                        out.write("\r\n".getBytes()); // 多个文件时，二个文件之间加入这个
                    }
                    in.close();
                }else{
                    System.out.println("没有发现文件");
                }
            }
            //发送流
            out.write(end_data);
            out.flush();
            out.close();
            // 定义BufferedReader输入流来读取URL的响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                conn.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                result += line;
            }
//            System.out.println("================");
//            System.out.println(result.toString());//可以把结果打印出来瞅瞅
//            System.out.println("================");
            //后面可以对结果进行解析（如果返回的是格式化的数据的话）
        } catch (Exception e) {
            System.out.println("发送POST请求出现异常！" + e);
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String args[]) throws Exception {
        //模拟流文件及参数上传
        String url = "http://127.0.0.1:5566/demo/test/receiveStream";
        //文件列表，搞了三个本地文件
        List<String> fileList = new ArrayList<>();
        fileList.add("C:\\Users\\WEGAME\\Desktop\\66656.jpg");
        fileList.add("C:\\Users\\WEGAME\\Desktop\\1515.jpeg");
        fileList.add("C:\\Users\\WEGAME\\Desktop\\777.png");
        //json字符串，模拟了一个，传图片名字吧
        String jsonString = "{\n" +
            "    \"token\": \"stream data\", \n" +
            "    \"content\": [\n" +
            "        {\n" +
            "            \"id\": \"1\", \n" +
            "            \"name\": \"66656.jpg\"\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"2\", \n" +
            "            \"name\": \"1515.jpeg\"\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"3\", \n" +
            "            \"name\": \"777.png\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";
        JSONObject json = JSONObject.parseObject(jsonString);

        doPostFileStreamAndJsonObj(url, fileList, json);
    }
    //public static void main(String[] args) throws FileNotFoundException {
    //    File file = new File("C:\\Users\\WEGAME\\Desktop\\256.jpg");
    //    try {
    //        //byte[] bytes = FileCopyUtils.copyToByteArray(file);
    //        String str = "好的卡上肯定会";
    //        //Blob blob = new SerialBlob(bytes);
    //        Blob blob = new SerialBlob(str.getBytes());
    //        //synchronizeApplicationInfo2();
    //        String blobString = new String(blob.getBytes(1, (int) blob.length()));
    //        System.out.println(blobString);
    //        InputStream inStream = blob.getBinaryStream();
    //        long nLen = blob.length();
    //        int nSize = (int) nLen;
    //        byte[] data = new byte[nSize];
    //        inStream.read(data);
    //        inStream.close();
    //        String blobToStr = new String(data);
    //        System.out.println(blobToStr);
    //       /* InputStream is = blob.getBinaryStream();
    //        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
    //        StringBuffer stringBuffer = new StringBuffer();
    //        String oneLine = "";
    //        while ((oneLine=bufferedReader.readLine())!=null){
    //            stringBuffer.append(bufferedReader.readLine());
    //        }*//*
    //        //String blobString = new String(blob.getBytes(1, (int) blob.length()),"GBK");
    //        //Blob b = Hibernate.createBlob(blobString.getBytes());
    //        Blob b = new SerialBlob(blobToStr.getBytes());
    //        //byte[] bytes1 = blobToStr.getBytes();
    //        //ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes1);
    //        //InputStream inputStream = bytes1.getBinaryStream();
    //        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\WEGAME\\Desktop\\1233asd585556.jpg"));
    //        //FileCopyUtils.copy(byteArrayInputStream,fos);
    //        FileCopyUtils.copy(b.getBinaryStream(),fos);
    //        fos.close();
    //        System.out.println(bytes);
    //        System.out.println(blob.toString());*/
    //    }  catch (SerialException throwables) {
    //        throwables.printStackTrace();
    //    } catch (SQLException throwables) {
    //        throwables.printStackTrace();
    //    } catch (UnsupportedEncodingException e) {
    //        e.printStackTrace();
    //    } catch (IOException e) {
    //        e.printStackTrace();
    //    }
    //}
}
