package com.laonworks.toyboard.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostBean {
	private int post_num;
	private String post_name;
	private String member_name;
	private String post_content;
	private Timestamp post_date;

}
