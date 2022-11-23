package com.laonworks.toyboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.laonworks.toyboard.service.PostService;

@Controller
public class PostController {

	@Autowired
	@Qualifier("post")
	private PostService ps;
	
	@RequestMapping("/board")
	public String callBoard() {
		return "board/boardmain";
	}
	
	
}