package com.hompan.tueparking.parkingspace.entity;

import com.hompan.tueparking.parkingspace.util.TimeUtil;

import lombok.Data;

@Data
public class News {
	int id;
	long createtime;
	String title;
	String content;
	String date;
	public String getDate() {
		return TimeUtil.timeToDate(createtime);
	}
}
