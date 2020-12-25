package com.plaso.service;

import com.plaso.bean.Student;

public interface StudentService {
    Student selectUser(int id);
    int saveUser(Student user);
    int saveUserException(Student user);

}
