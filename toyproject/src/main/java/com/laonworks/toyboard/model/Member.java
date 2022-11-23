package com.laonworks.toyboard.model;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("member")
public class Member {
	
	private String member_email;
	private String member_name;
	private String member_pw;
	private String member_phone1;
	private String member_phone2;
	private String member_phone3;
	private int member_delete_yn;
}
