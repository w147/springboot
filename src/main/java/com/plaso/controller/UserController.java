package com.plaso.controller;

import com.plaso.bean.User;
import com.plaso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/getUser")
    public User getALibrarianInfo(HttpServletRequest req) {
        Map map = req.getParameterMap();
        String[] ids = (String[]) map.get("id");
        int id = Integer.valueOf(ids[0]);
        //System.out.println("test :id: "+id);
        return userService.selectUser(id);
    }

    @PostMapping("/add")
    public Long add(User user) {
        return userService.saveUser(user);
    }

}
