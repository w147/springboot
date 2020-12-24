package com.plaso.service.impl;

import com.plaso.bean.User;
import com.plaso.dao.UserDao;
import com.plaso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userMapper;

    @Override
    public User selectUser(int id) {
        // TODO Auto-generated method stub
        return userMapper.selectUser(id);
    }
}