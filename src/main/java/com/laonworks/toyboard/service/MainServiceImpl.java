package com.laonworks.toyboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.laonworks.toyboard.dao.MainDao;
import com.laonworks.toyboard.dao.MainMapper;
import com.laonworks.toyboard.model.Member;

//@Service("main")
@Service
public class MainServiceImpl implements MainService {

	@Autowired
	private MainDao md;
	
	@Autowired
	private MainMapper mm;
	
	// 회원 검색
	public Member getMember(String member_email) {
		return md.getMember(member_email);
	}
	
	/*[비번 찾기 메일 보내기]*/
	@Override
	public Member pwfind(Member mem) throws Exception {
		return mm.pwfind(mem);
	}

}
