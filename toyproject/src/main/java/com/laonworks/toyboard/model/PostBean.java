package com.laonworks.toyboard.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostBean {
	private int post_num;
	private String post_name;
	private String member_email;
	private String post_content;
	private Date post_date;

}
