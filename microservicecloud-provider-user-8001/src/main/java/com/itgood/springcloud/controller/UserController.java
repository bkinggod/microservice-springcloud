package com.itgood.springcloud.controller;

import com.itgood.springcloud.entities.User;
import com.itgood.springcloud.service.itf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bicheng on 2019/1/4.
 */
@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/user/get/{id}")
    public User get(@PathVariable("id") Long id){
        return service.get(id);
    }

    @GetMapping("/user/getAll")
    public List<User> getAll(){
        return service.getAll();
    }


}
