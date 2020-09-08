package com.leyou1.common1.leyou1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Leyou1Application {

    public static void main(String[] args) {

        SpringApplication.run(Leyou1Application.class, args);
    }

}
