package com.hompan.tueparking.parkingspace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hompan.tueparking.parkingspace.mapper.NewsMapper;
import com.hompan.tueparking.parkingspace.entity.News;

@Service
public class NewsService {

	@Autowired
	NewsMapper newsMapper;
	
	public List<News> getNewsList(){
		return newsMapper.getNews();
	}
	
	public News getNewsById(int id) {
		return newsMapper.getNewById(id);
	}
}
