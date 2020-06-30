package com.lifeisgg.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @WebName: Config
 * @Description: TODO
 * @author: Chen Long
 * @date: 2020/6/25  13:34
 * “Welcome,my master”
 */
@Configuration
public class Config {
    @Bean
    @LoadBalanced /*实现负载均衡*/
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
