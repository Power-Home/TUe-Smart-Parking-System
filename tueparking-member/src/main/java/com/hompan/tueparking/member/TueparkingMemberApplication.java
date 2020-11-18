package com.hompan.tueparking.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.hompan.tueparking.member.feign")
public class TueparkingMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(TueparkingMemberApplication.class, args);
    }

}
