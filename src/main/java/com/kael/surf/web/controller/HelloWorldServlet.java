package com.kael.surf.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldServlet {

	@RequestMapping("/mvc")
	public String hellMvc(){
		return "home";
	}
}
