package com.leyou1.common.leyou1geteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Leyou1GetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Leyou1GetewayApplication.class, args);
    }

}
