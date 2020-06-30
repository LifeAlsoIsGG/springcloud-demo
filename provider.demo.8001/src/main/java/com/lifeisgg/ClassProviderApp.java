package com.lifeisgg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @WebName: ClassProviderApp
 * @Description: TODO
 * @author: Chen Long
 * @date: 2020/6/24  15:42
 * “Welcome,my master”
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClassProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ClassProviderApp.class,args);

    }
}
