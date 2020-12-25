package com.plaso.service;

import com.plaso.bean.User;

public interface UserService {
    User selectUser(int id);
    int saveUser(User user);
}
