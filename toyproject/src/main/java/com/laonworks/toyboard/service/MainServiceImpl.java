package com.laonworks.toyboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laonworks.toyboard.dao.MainMapper;
import com.laonworks.toyboard.model.Member;

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	private MainMapper md;

	/*[비번 찾기 메일 보내기]*/
	@Override
	public Member findpw(Member mem) throws Exception {
		return md.findpw(mem);
	}
}
