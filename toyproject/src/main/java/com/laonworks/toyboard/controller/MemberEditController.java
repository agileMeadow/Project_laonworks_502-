package com.laonworks.toyboard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.laonworks.toyboard.model.MemberEditBean;
import com.laonworks.toyboard.service.MemberEditServiceImp;

@Controller
public class MemberEditController {

	@Autowired
	private MemberEditServiceImp membereditservice;
	
	@RequestMapping("/member_edit")
	public String member_edit(HttpSession session, Model model) throws Exception {
			
		String email = (String)session.getAttribute("email");
		
		MemberEditBean member = membereditservice.userCheck(email);// 범수님 함수로 바꿔서 유저정보 불러오기
		// xml의 parameterType도 범수님거로 바꾸기, 
		model.addAttribute("member", member);
		
		return "member_edit/member_edit";
	}
	
	@RequestMapping(value="/member_edit_ok", method = RequestMethod.POST)
	public String member_edit_ok(HttpServletRequest request,
								 HttpSession session,
								 Model model) throws Exception{
		
		String email = (String)session.getAttribute("email");
		
		MemberEditBean member = this.membereditservice.userCheck(email);	// 이 지점에서 this가 어떤 역할?
		
		member.setMember_email(email);	// 이 지점에서 set이 어떤 역할?
		
		membereditservice.updateMember(member);
		
		return "main";
		
	}
	
	@RequestMapping(value="/member_del")
	public String member_del(HttpSession session, Model model) throws Exception{

		String email = (String)session.getAttribute("email"); // email의 의미?
		
		MemberEditBean member = membereditservice.userCheck(email);// 범수님 함수로 바꿔서 유저정보 불러오기
		
		model.addAttribute("del_email", email);
		model.addAttribute("del_name", member.getMember_name());
		
		return "member_edit/member_del";
		
	}

	@RequestMapping(value="/member_del_ok")
	public String member_del_ok(@RequestParam("pw") String password,	//pw?
								@RequestParam("member_delete_yn") int member_delete_yn,
								HttpSession session, 
								Model model) throws Exception{
		
		String email = (String)session.getAttribute("email"); // email의 의미?
		
		MemberEditBean member = this.membereditservice.userCheck(email);// 범수님 함수로 바꿔서 유저정보 불러오기
		
		if(!member.getMember_pw().equals(password)) {		// 비번 같을 때
			return "member_edit/deleteResult";
		}else {												// 비번 다를 때
			
			MemberEditBean mdel  = new MemberEditBean();
			mdel.setMember_email(email);
			mdel.setMember_delete_yn(member_delete_yn);
			
			membereditservice.deleteMember(mdel);
			
			session.invalidate();
			
			return "redirect:member_login";		// 범수님 로그인 뷰파일로 설정하기	
		}		
	}
	
	
}

