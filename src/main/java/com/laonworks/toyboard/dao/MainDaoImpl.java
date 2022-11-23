package com.laonworks.toyboard.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.laonworks.toyboard.model.Member;

@Repository
@Primary
public class MainDaoImpl implements MainDao{

	@Autowired
	private SqlSession session;

	// 회원 검색
	public Member getMember(String member_email) {
		return session.selectOne("member.getMember", member_email);
	}
	
	
	
}
