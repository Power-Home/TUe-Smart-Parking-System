package com.hompan.tueparking.member.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hompan.tueparking.member.entity.User;
import com.hompan.tueparking.member.service.UserService;

@Controller
@ResponseBody
public class UserController {
	
	@Autowired
	UserService userService;	

	@GetMapping("/memberList")
	public List<User> getMemberList(){
		List<User> members = userService.getMemberList();
		return members;
	}
	
	//查看个人信息
	@PostMapping("/myInfo")
	public User getInfo(@RequestBody int id) {
		User u = userService.getUser(id);
		return u;
	}
}
