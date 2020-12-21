package com.xkcoding.swagger.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author ：wj
 * @date ：Created in 2020/12/18 17:25
 * @description：
 * @modified By：
 * @version: $
 */

@RestController
@RequestMapping("/test")
//跨域注解
@CrossOrigin
public class TestController {

    /**
     * 接收流信息
     *
     * @param request
     * @return
     */
    @PostMapping("/receiveStream")
    public String receiveStream(HttpServletRequest request) {
        String result = "";
        System.out.println("进来了");
        try {
            //获取request里的所有部分
            Collection<Part> parts = request.getParts();
            for (Iterator<Part> iterator = parts.iterator(); iterator.hasNext(); ) {
                Part part = iterator.next();
                System.out.println("名称========" + part.getName());
                if ("JsonObj".equals(part.getName())) {
                    //解析json对象
                    BufferedReader reader = new BufferedReader(new InputStreamReader(part.getInputStream()));
                    String line = "";
                    String parseString = "";
                    while ((line = reader.readLine()) != null) {
                        parseString += line;
                    }
                    JSONObject json = JSONObject.parseObject(parseString);
                    System.out.println("接收到的json对象为=====" + json.toJSONString());
                } else if ("File".equals(part.getName())) {
                    String fileName = "";
                    Long size = part.getSize();
                    //文件名的获取，可以直接获取header里定义好的FIleName（大部分没有），或从Content-Disposition去剪切出来
//                    String head = part.getHeader("Content-Disposition");
//                    fileName = head.substring(head.indexOf("filename=")+ 10, head.lastIndexOf("\""));
                    fileName = part.getHeader("FileName");
                    System.out.println(fileName + size);
                    //这里就是文件，文件流就可以直接写入到文件了
                    InputStream inputStream = part.getInputStream();
                    OutputStream outputStream = new FileOutputStream("ss"+fileName);
                    int bytesWritten = 0;
                    int byteCount = 0;
                    byte[] bytes = new byte[1024*1024];
                    while ((byteCount = inputStream.read(bytes)) != -1) {
                        outputStream.write(bytes, bytesWritten, byteCount);
                        bytesWritten += byteCount;
                    }
                    inputStream.close();
                    outputStream.close();
                }
            }

            //如果嫌上面获取文件的麻烦，用下面这个比较简单，解析成multipartFile
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            //统计文件数
            Integer fileCount = 0;
            //请求里key为File的元素（即文件元素）
            List<MultipartFile> list = multiRequest.getFiles("File");
            while (fileCount < list.size()) {
                MultipartFile file = list.get(fileCount);
                System.out.println(file.getName());
                System.out.println(file.getOriginalFilename());
                System.out.println(file.getSize());
                fileCount++;
            }
            System.out.println("共有" + fileCount + "个文件");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
