package com.plaso.controller;

import com.plaso.bean.User;
import com.plaso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/getUser")
    public User getALibrarianInfo(int id) {
        //System.out.println("test :id: "+id);
        return userService.selectUser(id);
    }

    @PostMapping("/add")
    public int add(User user) {
        return userService.saveUser(user);
    }

}
