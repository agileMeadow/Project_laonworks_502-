package com.laonworks.toyboard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.laonworks.toyboard.model.Member;

@Mapper
public interface MainMapper {
	
	/*[비번 찾기 메일 보내기]*/
	public Member findpw(Member mem);

}


