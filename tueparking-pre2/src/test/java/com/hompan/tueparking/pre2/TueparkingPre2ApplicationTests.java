package com.hompan.tueparking.pre2;

import com.hompan.tueparking.pre2.mapper.UserMapper;
import com.hompan.tueparking.pre2.pojo.User;
import com.hompan.tueparking.pre2.service.BSeatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TueparkingPre2ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> all = userMapper.findAll();
        System.out.println(all);
        all.forEach((item)->{
            System.out.println("+++++++++"+item);
        });
    }

}
