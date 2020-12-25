package com.plaso.service.impl;

import com.plaso.bean.User1;
import com.plaso.bean.User2;
import com.plaso.service.TransactionService;
import com.plaso.service.User1Service;
import com.plaso.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;

public class TransactionServiceImpl implements TransactionService {

    @Autowired
    User1Service user1Service;

    @Autowired
    User2Service user2Service;

    @Override
    public void notransaction_exception_required_required() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequired(user2);

        throw new RuntimeException();
    }

    @Override
    public void notransaction_required_required_exception(){
        User1 user1=new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2=new User2();
        user2.setName("李四");
        user2Service.addRequiredException(user2);
    }


}
