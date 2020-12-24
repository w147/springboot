package com.plaso.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(path = "post")
public class ParamPostRest {

    @PostMapping(path = "req")
    public String requestParam(HttpServletRequest req) {
//        return JSONObject.toJSONString(req.getParameterMap());
        return "";
    }



}