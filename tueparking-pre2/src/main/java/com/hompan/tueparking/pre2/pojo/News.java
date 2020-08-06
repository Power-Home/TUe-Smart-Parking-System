package com.hompan.tueparking.pre2.pojo;

import com.hompan.tueparking.pre2.util.TimeUtil;

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
