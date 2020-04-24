package cn.itcast.service;

import cn.itcast.pojo.User;

public interface UserService {

    public User queryById(long id);

    public void insertUser(User user);
}
