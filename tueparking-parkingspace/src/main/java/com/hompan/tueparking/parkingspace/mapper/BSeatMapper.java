package com.hompan.tueparking.parkingspace.mapper;

import org.apache.ibatis.annotations.*;

import com.hompan.tueparking.parkingspace.entity.BSeat;

@Mapper
public interface BSeatMapper {

	@Select("select count(1) from bookseat where userid=#{userid}")
	int getBookCount(@Param("userid")int userid);

	@Insert("insert bookseat(userid,seatid,booktime) values(#{userid},#{seatid},#{booktime})")
	boolean bookSeat(@Param("userid")int userid, 
			
			@Param("seatid")int seatid, 
			@Param("booktime")long booktime);

	@Select("select * from bookseat where userid=#{userid}")
	BSeat getBook(@Param("userid")int userid);

	@Delete("delete from bookseat where id = #{id}")
	boolean cancel(@Param("id")int id);

	@Select("select * from bookseat where id=#{id}")
	BSeat getBookById(@Param("id")int id);

}
