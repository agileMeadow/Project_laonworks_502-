package com.laonworks.toyboard.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laonworks.toyboard.Dao.MainDao;
import com.laonworks.toyboard.Model.Member;

@Service

public class MainServiceImpl implements MainService {

	@Autowired
	
	private MainDao md;
	
	// 회원 검색
	public Member getMember(String member_email) {
		return md.getMember(member_email);
	}

}
