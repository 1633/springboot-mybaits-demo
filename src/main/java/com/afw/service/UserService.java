package com.afw.service;

import com.afw.model.User;

import java.util.List;

/**
 * Created by gztp on 2018/4/24.
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
