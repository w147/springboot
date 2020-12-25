package com.plaso.dao;

import com.plaso.bean.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao {

    Student selectUser(int id);

    int save(Student user);
}