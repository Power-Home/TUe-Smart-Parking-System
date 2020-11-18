package com.hompan.tueparking.parkingspace.service;

import java.util.HashMap;
import java.util.List;

import com.hompan.tueparking.parkingspace.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.hompan.tueparking.parkingspace.mapper.NewsMapper;
import com.hompan.tueparking.parkingspace.entity.News;

@Service
public class NewsService {

	@Autowired
	NewsMapper newsMapper;
	@Autowired
	JavaMailSenderImpl mailSender;
	@Autowired
	UserService userService;
	
	public List<News> getNewsList(){
		return newsMapper.getNews();
	}
	
	public News getNewsById(int id) {
		return newsMapper.getNewById(id);
	}

	@RabbitListener(queues = "tueparking.member")
	public void sendEmail(HashMap<String,Object> map){
		SimpleMailMessage message = new SimpleMailMessage();
		if(map.get("msg")=="注册成功！"){
			User user = (User) map.get("user");
			message.setText("尊敬的"+user.getName()+"先生/女士。	恭喜注册成功，祝您使用愉快！");
			message.setSubject((String) map.get("msg"));
			message.setTo(user.getEmail());
			System.out.println("目标邮箱："+user.getEmail());
		}else{
			User user = userService.getUser((Integer) map.get("userid"));
			message.setSubject((String) map.get("msg"));
			message.setText("尊敬的"+user.getName()+"先生/女士。	您的订单号是000"+map.get("orderid"));
			message.setTo(user.getEmail());
			System.out.println("目标邮箱："+user.getEmail());
		}

		message.setFrom("844279044@qq.com");
		System.out.println("Email sent"+map);
		mailSender.send(message);
	}
}
