package com.plaso.service.impl;

import com.plaso.bean.Student;
import com.plaso.bean.User;
import com.plaso.dao.UserDao;
import com.plaso.service.StudentService;
import com.plaso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private StudentService studentService;

    @Override
    public User selectUser(int id) {
        return userDao.selectUser(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int saveUser(User user){
        Student stu = new Student(1,"赵振", "zhaozhen");
        studentService.saveUser(stu);
        return userDao.save(user);
    }
}