package com.hompan.tueparking.pre2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hompan.tueparking.pre2.mapper")
public class TueparkingPre2Application {

    public static void main(String[] args) {
        SpringApplication.run(TueparkingPre2Application.class, args);
    }

}
