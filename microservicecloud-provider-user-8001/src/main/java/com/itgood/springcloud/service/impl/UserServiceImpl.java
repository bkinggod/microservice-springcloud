package com.itgood.springcloud.service.impl;

import com.itgood.springcloud.dao.UserDao;
import com.itgood.springcloud.entities.User;
import com.itgood.springcloud.service.itf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bicheng on 2019/1/4.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao dao;

    @Override
    public User get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<User> getAll() {
        return dao.findAll();
    }
}
