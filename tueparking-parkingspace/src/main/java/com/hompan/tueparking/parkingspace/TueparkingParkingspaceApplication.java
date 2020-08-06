package com.hompan.tueparking.parkingspace;

import org.mybatis.spring.annotation.MapperScan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hompan.tueparking.parkingspace.mapper")
public class TueparkingParkingspaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TueparkingParkingspaceApplication.class, args);
    }

}

