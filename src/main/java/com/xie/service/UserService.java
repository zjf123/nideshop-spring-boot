package com.xie.service;

import com.github.pagehelper.PageInfo;
import com.xie.bean.User;

/**
 * Created by xie on 16/11/24.
 */
public interface UserService {

    User getById(int id);

    User getByOpenId(String openId);

    PageInfo<User> getAllUsers(int pageNum, int pageSize);

    int insert(User user);

    int update(User user);

    int insertAll(User user);

    int updateAll(User user);

    int delete(User user);

    int delete(int id);

    int checkUsername(String username);

    int checkMobile(String mobile);

    int count();
}
