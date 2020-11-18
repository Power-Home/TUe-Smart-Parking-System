package com.hompan.tueparking.parkingspace.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * 泊位 实体
 *
 *
 */
@Data
public class Seat implements Serializable {
	private int id;
	private int parkingid;
	private String name;
	private int status;
}
