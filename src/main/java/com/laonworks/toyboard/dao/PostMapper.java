package com.laonworks.toyboard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.laonworks.toyboard.model.PostBean;

@Mapper
public interface PostMapper {
	public int getTotalPost() throws Exception;
	public List<PostBean> callAllPost(int startPage) throws Exception;
	public PostBean callOnePost(int post_num) throws Exception;
	public void insertPost(PostBean post) throws Exception;
	public void updatePost(PostBean post) throws Exception;
	public void deletePost(int post_num) throws Exception;

}
