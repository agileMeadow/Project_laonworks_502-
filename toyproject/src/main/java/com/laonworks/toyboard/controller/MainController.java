package com.laonworks.toyboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		int b=2;
		return "index";
	}
	


}
