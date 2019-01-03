package com.itgood.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by bicheng on 2019/1/3.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService7102Application {

    public static void main(String[] args){
        SpringApplication.run(EurekaService7102Application.class);
    }
}
