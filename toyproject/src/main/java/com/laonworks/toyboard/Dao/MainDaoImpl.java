package com.laonworks.toyboard.Dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.laonworks.toyboard.Model.Member;

@Repository

public class MainDaoImpl implements MainDao{

	@Autowired
	private SqlSession session;

	// 회원 검색
	public Member getMember(String member_email) {
		return session.selectOne("getMember", member_email);
	}
	
	
	
}
