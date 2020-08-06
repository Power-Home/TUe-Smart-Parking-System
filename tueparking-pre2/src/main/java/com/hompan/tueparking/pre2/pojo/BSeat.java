package com.hompan.tueparking.pre2.pojo;

import com.hompan.tueparking.pre2.util.TimeUtil;

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
