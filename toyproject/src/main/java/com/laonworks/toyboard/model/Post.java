package com.laonworks.toyboard.model;



import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("post")

public class Post {
	private int post_num;
	private String post_name;
	private String member_email;
	private String post_content;
	private Timestamp post_date;
	
}