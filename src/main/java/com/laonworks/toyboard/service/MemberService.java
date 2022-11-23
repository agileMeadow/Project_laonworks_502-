package com.laonworks.toyboard.service;

import com.laonworks.toyboard.model.MemberBean;

public interface MemberService {

	public int insertmember(MemberBean mb) throws Exception;
	
	public int emailcheck(String member_email) throws Exception;
}
