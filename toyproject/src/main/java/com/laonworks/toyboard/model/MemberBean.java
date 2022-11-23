package com.laonworks.toyboard.model;

import lombok.Data;

@Data
public class MemberBean {

	private String member_email;
	private String member_name;
	private String member_pw;
	private String member_phone1;
	private String member_phone2;
	private String member_phone3;
	private int member_delete_yn;
	
}
