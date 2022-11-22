package com.laonworks.toyboard.service;

import java.util.List;

import com.laonworks.toyboard.model.PostBean;

public interface PostService {
	// 글 리스트 호출
	public List<PostBean> callAllPost(int startPage, int endPage);

	// 글 상세보기
	public PostBean callOnePost(int post_num);
	
	// 글 작성
	public void insertPost(String post_name, String member_name, String post_content);
	
	// 글 수정
	public void updatePost(String post_name, String post_content);
	
	// 글 삭제
	public void deletePost(int post_num);

}
