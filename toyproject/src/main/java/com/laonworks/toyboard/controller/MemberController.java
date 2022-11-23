package com.laonworks.toyboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.laonworks.toyboard.model.Member;
import com.laonworks.toyboard.service.MainService;

@Controller

public class MemberController {
	
	@Autowired
	@Qualifier("main")
	private MainService ms;
	
	// 로그인 폼 이동
	@RequestMapping("loginForm")
	public String loginForm() {
		return "loginForm";
	}
	  
	// 로그인
	@RequestMapping("login")
	public String login(String member_email, String member_pw,
						Model model, HttpSession session) {
		
		System.out.println("login in");
		
		int result = 0;
		
		Member m = ms.getMember(member_email);
		
		if(m == null){	// 회원이 아닌 경우
			result = 1;
			model.addAttribute("result", result);
		}else {			// 회원
			if(m.getMember_pw().equals(member_pw)) {
				session.setAttribute("member_email", member_email);
				
				return "main";	// 메인 페이지로 이동
			}else {
				result = 2;
				model.addAttribute("result", result);
			}
		}
		
		return "loginResult";
	}
	
	// 로그아웃
	@RequestMapping("logout")
	public String member_logout(HttpSession session) {	
		
		session.invalidate();
		
		return "main";
	}
	
//	// 메인 페이지로 이동
	@RequestMapping("main")
	public String main() {
		return "main";
	}

}
