package com.hompan.tueparking.pre2.pojo;

import lombok.Data;

/**
 * 
 * 泊位 实体
 *
 *
 */
@Data
public class Seat {
	private int id;
	private int parkingid;
	private String name;
	private int status;
}
