package com.hompan.tueparking.parkingspace;

import org.mybatis.spring.annotation.MapperScan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.hompan.tueparking.parkingspace.mapper")
@EnableFeignClients(basePackages = "com.hompan.tueparking.parkingspace.feign")
@EnableCaching
@EnableRabbit  //开启基于注解的mq
public class TueparkingParkingspaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TueparkingParkingspaceApplication.class, args);
    }

}

