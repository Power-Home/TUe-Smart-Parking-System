package com.hompan.tueparking.member.service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.hompan.tueparking.member.mapper.UserMapper;
import com.hompan.tueparking.member.entity.User;
import com.hompan.tueparking.member.util.KeyUtil;

/**
 *
 * 
 * 用户业务层
 *
 */
@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;

	public List<User> getMemberList(){
		List<User> users = userMapper.findAll();
		ArrayList<User> members = new ArrayList<>();
		for(User user:users){
			if (user.getIdentity()==1){
				members.add(user);
			}
		}
		System.out.println("memberlist:"+members);
		return members;
	}

	/**
	 * 修改用户信息
	 * @param u
	 * @return
	 */
	public Map<String, Object> changeUserInfo(User u) {
		Map<String, Object> map = new HashMap<String, Object>();
		String tel = userMapper.findById(u.getId()).getTel();
		if (!tel.equals( u.getTel()) && null != userMapper.find(u.getTel())) {
			// 电话修改,检查是否已经存在
			// 已经存在
			map.put("state", 2);
			map.put("msg", "修改失败，该电话已用于另一个账户");
		}else {
			userMapper.change(u);
			map.put("state", 1);
			map.put("msg", "修改成功");
		}
		return map;
	}
	
	/**
	 * 根据id获取当前用户信息
	 * @param id
	 * @return
	 */
	public User getUser(int id) {
		User u = userMapper.findById(id);
		return u;
	}
}
