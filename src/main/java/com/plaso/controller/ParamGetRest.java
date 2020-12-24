package com.plaso.controller;

import com.plaso.bean.BaseReqDO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "get")
public class ParamGetRest {

    @GetMapping(path = "req")
    public String requestParam(HttpServletRequest httpRequest) {
        Map<String, String[]> ans = httpRequest.getParameterMap();
        return "ans";
    }

    @GetMapping(path = "req2")
    public String requestParam2() {
        HttpServletRequest request =
                ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        String name = request.getParameter("name");
        return "param Name=" + name;
    }

    @GetMapping(path = "arg")
    public String argParam(String name, Integer age) {
        return "name: " + name + " age: " + age;
    }

    @GetMapping(path = "arg2")
    public String argParam2(String[] names, int size) {
        return "name: " + (names != null ? Arrays.asList(names) : "null") + " size: " + size;
    }

    @GetMapping(path = "ano")
    public String anoParam(@RequestParam(name = "name") String uname,
                           @RequestParam(name = "age", required = false) Integer age,
                           @RequestParam(name = "uids", required = false) Integer[] uids) {
        return "name: " + uname + " age: " + age + " uids: " + (uids != null ? Arrays.asList(uids) : "null");
    }

    public enum TYPE {
        A, B, C;
    }

    @GetMapping(path = "enum")
    public String enumParam(TYPE type) {
        return type.name();
    }

    @GetMapping(path = "enum2")
    public String enumParam2(@RequestParam TYPE type) {
        return type.name();
    }

    @GetMapping(path = "mapper")
    public String mapperParam(@RequestParam Map<String, Object> params) {
        return params.toString();
    }

    // 注意下面这个写法，无法正常获取请求参数，这里用来对比列出
    @GetMapping(path = "mapper2")
    public String mapperParam2(Map<String, Object> params) {
        return params.toString();
    }


    @GetMapping(path = "ano1")
    public String anoParam1(@RequestParam(name = "names") List<String> names) {
        return "name: " + names;
    }

    // 注意下面这个写法无法正常解析数组
    @GetMapping(path = "arg3")
    public String anoParam2(List<String> names) {
        return "names: " + names;
    }

    @GetMapping(path = "url/{name}/{index}")
    public String urlParam(@PathVariable(name = "name") String name,
                           @PathVariable(name = "index", required = false) Integer index) {
        return "name: " + name + " index: " + index;
    }

    @GetMapping(path = "bean")
    public String beanParam(BaseReqDO req) {
        return req.toString();
    }
}
