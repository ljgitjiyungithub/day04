package leyouitem.leyoutiemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LeyouTiemServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(LeyouTiemServiceApplication.class, args);
    }

}
