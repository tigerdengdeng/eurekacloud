package com.tiger.projecteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * spring boot 注解
 */
@SpringBootApplication
/**
 * 注册中心 注解
 */
@EnableEurekaServer
public class ProjectEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectEurekaApplication.class, args);
    }

}
