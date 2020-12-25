package com.plaso.service.impl;

import com.plaso.bean.User1;
import com.plaso.dao.User1Mapper;
import com.plaso.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class User1ServiceImpl implements User1Service {

    @Autowired
    User1Mapper user1Mapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(User1 user){
        user1Mapper.insert(user);
    }

}
