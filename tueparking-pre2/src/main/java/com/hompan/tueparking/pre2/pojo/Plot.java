package com.hompan.tueparking.pre2.pojo;

import java.math.BigDecimal;

import lombok.Data;

/**
 *
 * 停车场
 *
 *
 */
@Data
public class Plot {
	
	private int id;
	private String name;
	private String address;
	private int tel;
	private int totalparkinglot;
	private int leftparkinglot;
	private double charge;//收费  元/分钟
	private String description;
	private String map;//地图存放地址
	private int freetime;//免费时长 分钟
	private String comid;
	private Company company;
}
