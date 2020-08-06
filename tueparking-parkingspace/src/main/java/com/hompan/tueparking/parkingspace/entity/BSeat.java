package com.hompan.tueparking.parkingspace.entity;

import com.hompan.tueparking.parkingspace.util.TimeUtil;

import lombok.Data;

@Data
public class BSeat {

	private int id;
	private int seatid;
	private int userid;
	private long booktime;
	private String date;
	private Seat seat;
	
	
	public String getDate() {
		return TimeUtil.timeToDate(booktime);
	}
}
