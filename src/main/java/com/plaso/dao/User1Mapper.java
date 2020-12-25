package com.plaso.dao;

import com.plaso.bean.User1;

public interface User1Mapper {
    int insert(User1 record);
    User1 selectByPrimaryKey(Integer id);
}
