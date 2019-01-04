package com.itgood.springcloud.service.itf;

import com.itgood.springcloud.entities.User;

import java.util.List;

/**
 * Created by bicheng on 2019/1/4.
 */
public interface UserService {

    User get(Long id);

    List<User> getAll();
}
