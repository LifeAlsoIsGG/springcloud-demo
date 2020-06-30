package com.lifeisgg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @WebName: feignServiceApp
 * @Description: TODO
 * @author: Chen Long
 * @date: 2020/6/26  15:42
 * “Welcome,my master”
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class feignServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(feignServiceApp.class,args);
    }
}
