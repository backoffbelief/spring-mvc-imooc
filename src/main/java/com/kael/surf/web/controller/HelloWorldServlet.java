package com.kael.surf.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloWorldServlet {

	@RequestMapping(value="/mvc",method=RequestMethod.GET)
	public String hellMvc(){
		return "home";
	}
}
