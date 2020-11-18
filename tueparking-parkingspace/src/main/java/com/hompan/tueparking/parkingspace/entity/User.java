package com.hompan.tueparking.parkingspace.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * 用户
 *
 *
 */
@Data
public class User implements Serializable {

	private int id;
	private String passwd;
	private String tel;
	private String email;
	private String name;
	private String platenumber;//车牌号
	private int identity;//角色
	String comid;//物业id
	Company company;
		
}
