package com.plaso.service.impl;

import com.plaso.bean.Student;
import com.plaso.dao.StudentDao;
import com.plaso.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student selectUser(int id) {
        return studentDao.selectUser(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int saveUser(Student user){
        return studentDao.save(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int saveUserException(Student user){
        studentDao.save(user);
        throw new RuntimeException();
    }

}