package com.plaso.controller;

import com.plaso.bean.BaseReqDO;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Objects;

@RestController
@RequestMapping(path = "post")
public class ParamPostRest {

    @PostMapping(path = "req")
    public String requestParam(HttpServletRequest req) {
//        return JSONObject.toJSONString(req.getParameterMap());
        return "name";
    }

    @PostMapping(path = "body")
    public String bodyParam(@RequestBody BaseReqDO req) {
        return req == null ? "null" : req.toString();
    }

    @PostMapping(path = "entity")
    public String entityParam(RequestEntity requestEntity) {
        return Objects.requireNonNull(requestEntity.getBody()).toString();
    }

    private String getMsg(MultipartFile file) {
        String ans = null;
        try {
            ans = file.getName() + " = " + new String(file.getBytes(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        System.out.println(ans);
        return ans;
    }

    /**
     * 文件上传
     *
     * curl 'http://127.0.0.1:8080/post/file' -X POST -F 'file=@hello.txt'
     *
     * @param file
     * @return
     */
    @PostMapping(path = "file")
    public String fileParam(@RequestParam("file") MultipartFile file) {
        return getMsg(file);
    }

    @PostMapping(path = "file2")
    public String fileParam2(MultipartHttpServletRequest request) {
        MultipartFile file = request.getFile("file");
        return getMsg(file);
    }
}