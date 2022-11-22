package com.laonworks.toyboard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.laonworks.toyboard.model.PostBean;

@Mapper
public interface PostMapper {
	public List<PostBean> callAllPost(int startPage, int endPage);
	public PostBean callOnePost(int post_num);
	public void insertPost(@Param("post_name") String post_name, 
			@Param("member_email") String member_email, 
			@Param("post_content") String post_content);
	public void updatePost(@Param("post_name") String post_name,
			@Param("post_content") String post_content);
	public void deletePost(int post_num);

}
