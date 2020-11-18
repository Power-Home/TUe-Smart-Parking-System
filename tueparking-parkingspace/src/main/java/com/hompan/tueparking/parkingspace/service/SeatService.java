package com.hompan.tueparking.parkingspace.service;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.hompan.starter.annotation.RedisSynchronized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import com.hompan.tueparking.parkingspace.mapper.SeatMapper;
import com.hompan.tueparking.parkingspace.entity.Seat;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SeatService {
	@Autowired
	SeatMapper seatMapper;

	@Autowired
	RedisTemplate<Object,Object> template;

	/**
	 * 
	 * 根据泊位名与停车场id获取泊位id
	 * 
	 * @param name
	 * @param plotId
	 * @return
	 */
	public int getSeatId(String name,int plotId) {
		int seatId = seatMapper.getSeatId(name, plotId);
		return seatId;
	}

	public Seat getSeat(int seatid) {
		
		return seatMapper.getSeat(seatid);
	}

	/**
	 * 可用泊位列表
	 * @param plotId
	 * @return
	 */
	@RedisSynchronized
	public List<String> getAvailableSeats(int plotId) {
		return seatMapper.getAvailableSeatList(plotId);
	}

	/**
	 * 修改泊位状态
	 * @param seatid
	 * @return
	 */
	@RedisSynchronized
	public boolean changeSeatStatus(int seatid,int status) {
		
		return seatMapper.changeSeatStatus(seatid,status);
	}
	/**
	 * 车位列表
	 * @param plotId
	 * @return
	 */
	public List<Seat> getSeatList(int plotId) {

		//已实现的redis序列化器
		RedisSerializer redisSerializer = new StringRedisSerializer();
        template.setKeySerializer(redisSerializer);

		List<Seat> seats = (List<Seat>) template.opsForValue().get("Seat List-"+plotId);
		List<Seat> seats_db = null;
		System.out.println("initial request: "+seats);
		if(null==seats){
			synchronized (this){
				seats = (List<Seat>) template.opsForValue().get("Seat List-"+plotId);
				System.out.println("seats_list: "+seats);
				if(null==seats){
//					System.out.println("go to db "+seats);
					seats_db = seatMapper.getSeatList(plotId);
//					System.out.println("from db: "+seats_db);
					template.opsForValue().set("Seat List-"+plotId,seats_db,20, TimeUnit.SECONDS);
				}
			}
		}else{
			System.out.println("go to cache");
		}

		return seats==null?seats_db:seats;
	}

	public List<Seat> getSeatList2() {
		// TODO Auto-generated method stub
		return seatMapper.getSeatList2();
	}
}
