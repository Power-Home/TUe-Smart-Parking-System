package com.hompan.tueparking.pre2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hompan.tueparking.pre2.mapper.InfoMapper;
import com.hompan.tueparking.pre2.mapper.NewsMapper;
import com.hompan.tueparking.pre2.pojo.Info;
import com.hompan.tueparking.pre2.pojo.News;

@Service
public class InfoService {

	@Autowired
	InfoMapper infoMapper;
	
	public List<Info> getInfoList(){
		return infoMapper.getInfos();
	}
	
	public Info getInfoById(int id) {
		return infoMapper.getInfoById(id);
	}
}
