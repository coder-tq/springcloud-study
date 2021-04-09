package com.coder_tq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DeptProvider_hystrix_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_hystrix_8001.class, args);
    }
}
