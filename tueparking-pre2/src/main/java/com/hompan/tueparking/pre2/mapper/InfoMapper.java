package com.hompan.tueparking.pre2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.hompan.tueparking.pre2.pojo.Info;

@Mapper
public interface InfoMapper {

	@Select("select * from info")
	List<Info> getInfos();

	@Select("select * from info where id=#{id}")
	Info getInfoById(int id);

}
