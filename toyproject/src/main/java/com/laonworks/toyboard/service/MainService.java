package com.laonworks.toyboard.service;

import com.laonworks.toyboard.model.Member;

public interface MainService {
	
	/*[비번 찾기 메일 보내기]*/
	public Member findpw(Member mem)throws Exception;

}

