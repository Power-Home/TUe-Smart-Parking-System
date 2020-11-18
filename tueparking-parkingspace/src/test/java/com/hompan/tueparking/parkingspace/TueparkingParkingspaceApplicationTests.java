package com.hompan.tueparking.parkingspace;

import com.hompan.tueparking.parkingspace.entity.Seat;
import com.hompan.tueparking.parkingspace.service.RecordService;
import com.hompan.tueparking.parkingspace.service.SeatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootTest
class TueparkingParkingspaceApplicationTests {

    @Autowired
    SeatService seatService;

    @Autowired
    RecordService recordService;

    @Test
    void contextLoads() {
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("createtime","123456");
//        map.put("userid","5");
//        recordService.startParking(map,1);

//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 3; i++) {
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    seatService.getSeatList(1);
//                    System.out.println("here");
//                }
//            });
//        }

//        List<String> availableSeats = seatService.getAvailableSeats(1);
//        for (String seat: availableSeats) {
//            System.out.println(seat);
//        }
    }

}
