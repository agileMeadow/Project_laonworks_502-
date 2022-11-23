package com.laonworks.toyboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laonworks.toyboard.dao.MemberEditDaoImp;
import com.laonworks.toyboard.model.MemberEditBean;

@Service
public class MemberEditServiceImp implements MemberEditService{

	@Autowired
	private MemberEditDaoImp memberdao;
	
	public MemberEditBean userCheck(String id) throws Exception{
		return memberdao.userCheck(id);
	}
	
	public void updateMember(MemberEditBean member)throws Exception{
		memberdao.updateMember(member);
	}
	 
	public void deleteMember(MemberEditBean mdel)throws Exception{
		memberdao.deleteMember(mdel);
	}
}
