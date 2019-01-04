package com.itgood.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by bicheng on 2019/1/4.
 */
@SpringBootApplication
@EnableEurekaClient //本地服务启动后自动注册到eureka服务中
public class UserProvider8001Application {

    public static void main(String[] args){
        SpringApplication.run(UserProvider8001Application.class);
    }

}
