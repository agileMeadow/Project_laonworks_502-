package com.laonworks.toyboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laonworks.toyboard.dao.MemberDao;
import com.laonworks.toyboard.model.MemberBean;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDao memberDao;

	public int insertmember(MemberBean mb) throws Exception {
		int result = 0;
		result = memberDao.insertmember(mb);	
		return result;
	}
	
	@Override
	public int emailcheck(String member_email) throws Exception {
		int cnt = memberDao.emailcheck(member_email);
		System.out.println("cnt: " + cnt);
		return cnt;
	}	
	


}
