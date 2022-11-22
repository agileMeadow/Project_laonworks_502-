package com.laonworks.toyboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laonworks.toyboard.dao.PostMapper;
import com.laonworks.toyboard.model.PostBean;

@Service
public class PostServiceImpl implements PostService {
	@Autowired
	public PostMapper pm;

	@Override
	public List<PostBean> callAllPost(int startPage, int endPage) {
		return pm.callAllPost(startPage, endPage);
	}

	@Override
	public PostBean callOnePost(int post_num) {
		return pm.callOnePost(post_num);
	}

	@Override
	public void insertPost(String post_name, String member_email, String post_content) {
		pm.insertPost(post_name, member_email, post_content);
	}

	@Override
	public void updatePost(String post_name, String post_content) {
		pm.updatePost(post_name, post_content);
	}

	@Override
	public void deletePost(int post_num) {
		pm.deletePost(post_num);
	}

}
