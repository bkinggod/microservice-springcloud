package com.itgood.springcloud.controller;

import com.itgood.springcloud.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sun.rmi.runtime.Log;

import java.util.List;

/**
 * Created by bicheng on 2019/1/4.
 */
@RestController
public class UserController_Consumer {

    //private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-USER";
    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/get/{id}")
    public User get(@PathVariable Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/user/get/" + id, User.class);
    }
    @GetMapping("/consumer/getAll")
    public List<User> getAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/user/getAll", List.class);
    }

}
