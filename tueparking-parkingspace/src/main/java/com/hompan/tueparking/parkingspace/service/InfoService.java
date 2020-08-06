package com.hompan.tueparking.parkingspace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hompan.tueparking.parkingspace.mapper.InfoMapper;
import com.hompan.tueparking.parkingspace.mapper.NewsMapper;
import com.hompan.tueparking.parkingspace.entity.Info;
import com.hompan.tueparking.parkingspace.entity.News;

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
