package com.coder_tq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptCustomer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptCustomer_80.class,args);
    }
}
