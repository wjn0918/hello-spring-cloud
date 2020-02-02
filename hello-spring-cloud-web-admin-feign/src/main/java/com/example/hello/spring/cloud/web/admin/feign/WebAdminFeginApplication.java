package com.example.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
public class WebAdminFeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeginApplication.class,args);
    }
}
