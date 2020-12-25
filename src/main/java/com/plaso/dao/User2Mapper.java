package com.plaso.dao;

import com.plaso.bean.User2;

public interface User2Mapper {
    int insert(User2 record);
    User2 selectByPrimaryKey(Integer id);
}
