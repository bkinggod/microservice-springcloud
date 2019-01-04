package com.itgood.springcloud.dao;

import com.itgood.springcloud.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by bicheng on 2019/1/4.
 */
@Mapper
public interface UserDao {

    User findById(Long id);

    List<User> findAll();
}
