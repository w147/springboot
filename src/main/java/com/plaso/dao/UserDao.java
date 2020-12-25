package com.plaso.dao;

import com.plaso.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    User selectUser(int id);

    int save(User user);
}