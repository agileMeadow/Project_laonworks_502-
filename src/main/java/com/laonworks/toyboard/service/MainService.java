package com.laonworks.toyboard.service;

import org.springframework.context.annotation.Primary;

import com.laonworks.toyboard.model.Member;

public interface MainService {

	Member getMember(String member_email);
	
	/*[비번 찾기 메일 보내기]*/
	public Member pwfind(Member mem)throws Exception;


}
