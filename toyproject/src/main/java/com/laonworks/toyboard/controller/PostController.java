package com.laonworks.toyboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.laonworks.toyboard.model.PostBean;
import com.laonworks.toyboard.service.PostService;

@Controller
@Qualifier("post")
public class PostController {

	@Autowired
	private PostService ps;
	@Autowired
	private MainService ms;
	
	// 글 리스트 전체 불러오기
	@RequestMapping("/post")
	public String callPost() {
		return "post/postmain";
	}
	
	// 글 상세보기
	
	// 글 작성
	@RequestMapping("/postwrite")
	public String postWrite(String post_name, String post_content, HttpSession session) throws Exception {
		PostBean post = new PostBean();
		
		// 세션 호출
		String client_email = session.getAttribute("member_email");
		
		// 이메일로 정보 호출
		MemberBean client_info = ms. (client_email);
		System.out.println(client_info);
		
		post.setMember_email(client_email);
		post.setMember_name(client_info.getMember_name);
		post.setPost_name(post_name);
		post.setPost_content(post_content);
		
		ps.insertPost(post);
		
		return "";
	}
	
	// 글 수정 폼
	@RequestMapping("/postedit")
	public String postEdit(int post_num,Model model, HttpSession session)  throws Exception {
		
		PostBean post = ps.callOnePost(post_num);
		String returnpage = "";
		
		// 세션 호출
		String client_email = session.getAttribute("member_email");
		
		if (client_email.equals(post.getMember_email())) {
			
			model.addAttribute("post", post);
			
			returnpage = "";
		}else {
			returnpage = "";
		}
		
		return returnpage;
	}
	
	// 글 수정
	@RequestMapping("/postrevise")
	public String postRevise(int post_num, String post_name, String post_content, HttpSession session)  throws Exception {
		
		PostBean post = ps.callOnePost(post_num);
		String returnpage = "";
		
		// 세션 호출
		String client_email = session.getAttribute("member_email");
		
		if (client_email.equals(post.getMember_email())) {
			
			post.setPost_name(post_name);
			post.setPost_content(post_content);
			
			ps.updatePost(post);

			returnpage ="";
		}else {
			returnpage ="";
		}
		
		return returnpage;
	}
	
	// 글 삭제
	@RequestMapping("/postdelete")
	public String postDelete(int post_num, HttpSession session) throws Exception {
		
		PostBean post = ps.callOnePost(post_num);
		String returnpage = "";
		
		// 세션 호출
		String client_email = session.getAttribute("member_email");
		
		if (client_email.equals(post.getMember_email())) {
			ps.deletePost(post_num);

			returnpage = "";
		}else {
			returnpage = "";
		}
		
		return returnpage;
	}
	
	
}
