
package com.laonworks.toyboard.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.laonworks.toyboard.model.Member;
import com.laonworks.toyboard.service.MainService;
import com.laonworks.toyboard.service.MainServiceImpl;

@Controller
public class MainController {
	
	@Autowired
	@Qualifier("main")
	private MainService ms;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
 
	/*[비밀번호 찾기 폼]*/
	@RequestMapping("pwfind")
	public String member_pw_find() {
		System.out.println("컨트롤러 들어옴(pwfind)");
		
		return "pwfind";
	}
	
	/*[비번 찾기 메일 보내기] */
	@RequestMapping("pwfind_ok")
	public String member_pw_find_ok(@ModelAttribute Member mem,
									HttpServletResponse response,
									Model model)throws Exception {
		System.out.println("컨트롤러 들어옴(pwfind_ok)");
		
		response.setContentType("text/html; charset=UTF-8");
		
		Member member = ms.pwfind(mem); //[pwfind()메소드 : 비번 찾기 메소드]
		
		//값이 없는 경우
		if(member == null) {
			
			return "pwresult";
			
			//메일 전송	
			}else {
				// Mail Server 설정
				String charSet = "utf-8";
				String hostSMTP = "smtp.naver.com";
				String hostSMTPid = "alsgkqhfdl@naver.com";
				String hostSMTPpwd = "hhince159!!"; 

				// 보내는 사람
				String fromEmail = "alsgkqhfdl@naver.com";
				String fromName = "관리자";
				String subject = "비밀번호 찾기";

				// 받는 사람 
				String mail = member.getMember_email();

				try {
					HtmlEmail email = new HtmlEmail();
					email.setDebug(true);
					email.setCharset(charSet);
					email.setSSL(true);
					email.setHostName(hostSMTP);
					email.setSmtpPort(587);

					email.setAuthentication(hostSMTPid, hostSMTPpwd);
					email.setTLS(true);
					email.addTo(mail, charSet);
					email.setFrom(fromEmail, fromName, charSet);
					email.setSubject(subject);
					email.setHtmlMsg("<p align = 'center'>비밀번호 찾기</p><br>" + "<div align='center'> 비밀번호 : "
							+ member.getMember_pw() + "</div>");
					email.send();
				} catch (Exception e) {
					System.out.println(e);	
			}
			model.addAttribute("pwdok", "등록된 email을 확인 하세요.");
			return "pwfind";
		}	
			
	}
}

