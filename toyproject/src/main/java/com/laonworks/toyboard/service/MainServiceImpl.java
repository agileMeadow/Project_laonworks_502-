package com.laonworks.toyboard.service;

import java.lang.reflect.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laonworks.toyboard.dao.MainDao;

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	private MainDao md;

	/*[비번 찾기 메일 보내기]*/
	@Override
	public Member findpw(Member mem) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
