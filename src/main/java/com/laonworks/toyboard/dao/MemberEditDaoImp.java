package com.laonworks.toyboard.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.laonworks.toyboard.model.MemberEditBean;

@Repository
public class MemberEditDaoImp implements MemberEditDao{

	@Autowired
	private SqlSession session;
	
	public MemberEditBean userCheck(String email) throws Exception{
		return (MemberEditBean)session.selectOne("mens.userCheck", email);
	}
	
	
	public void updateMember(MemberEditBean member)throws Exception {
		// TODO Auto-generated method stub
		session.update("mens.updateMember", member);
	}
	
	public void deleteMember(MemberEditBean mdel)throws Exception{
		session.update("mens.deleteMember", mdel);
	}
	
}
