package com.laonworks.toyboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.laonworks.toyboard.model.MemberBean;
import com.laonworks.toyboard.service.MemberServiceImpl;

@Controller
public class InsertController {
  
	@Autowired
	@Qualifier("member")
	private MemberServiceImpl memberService;

	@RequestMapping("insert")
	public String test() {

		return "memberinsert";
	}   

	// 회원가입
	@RequestMapping("memberinsert_ok")
	public String memberinsert_ok(MemberBean mb) throws Exception {

		memberService.insertmember(mb);
		System.out.println("member_insert_ok");
		return "loginForm"; // 가입 후 로그인페이지로 이동
	}
  
	// 이메일 중복체크 
	@PostMapping("/emailcheck")  
	@ResponseBody 
	public int emailcheck(@RequestParam("member_email") String member_email) throws Exception {
		
		int cnt = memberService.emailcheck(member_email);

		if(cnt == 0) { // 사용 가능
			System.out.println("ok_email");
		}else {			// 중복, 사용 불가능
			System.out.println("already_email");
		}
		
		System.out.println("emailcheck");
		return cnt;
	}

}
