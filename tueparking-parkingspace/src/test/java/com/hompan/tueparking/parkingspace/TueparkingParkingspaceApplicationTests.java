package com.hompan.tueparking.parkingspace;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hompan.tueparking.parkingspace.entity.User;
import com.hompan.tueparking.parkingspace.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TueparkingParkingspaceApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.findAll();
        for (User user: users) {
            System.out.println(user);
        }
    }

}
