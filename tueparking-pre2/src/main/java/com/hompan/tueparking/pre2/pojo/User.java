package com.hompan.tueparking.pre2.pojo;

import lombok.Data;

/**
 * 
 * 用户
 *
 *
 */
@Data
public class User {

	private int id;
	private String passwd;
	private String tel;
	private String name;
	private String platenumber;//车牌号
	private int identity;//角色
	String comid;//物业id
	Company company;
		
}
