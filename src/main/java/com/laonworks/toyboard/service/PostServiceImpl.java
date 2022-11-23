package com.laonworks.toyboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.laonworks.toyboard.dao.PostMapper;
import com.laonworks.toyboard.model.PostBean;

//@Service("post")
@Service
public class PostServiceImpl implements PostService {
	@Autowired
	public PostMapper pm;
	
	// 총 글 갯수 
	@Override
	public int getTotalPost() throws Exception{
		return pm.getTotalPost();
	}
 
	@Override
	public List<PostBean> callAllPost(int startPage) throws Exception {
		return pm.callAllPost(startPage);
	}

	@Override
	public PostBean callOnePost(int post_num) throws Exception {
		return pm.callOnePost(post_num);
	}

	@Override
	public void insertPost(PostBean post) throws Exception {
		pm.insertPost(post);
	}

	@Override
	public void updatePost(PostBean post) throws Exception {
		pm.updatePost(post);
	}

	@Override
	public void deletePost(int post_num) throws Exception {
		pm.deletePost(post_num);
	}

}
