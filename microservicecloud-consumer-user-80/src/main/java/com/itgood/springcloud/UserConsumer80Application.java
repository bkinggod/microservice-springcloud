package com.itgood.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by bicheng on 2019/1/4.
 */
@SpringBootApplication
@EnableEurekaClient
public class UserConsumer80Application {

    public static void main(String[] args){
        SpringApplication.run(UserConsumer80Application.class);
    }
}
