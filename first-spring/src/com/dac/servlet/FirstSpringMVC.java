package com.dac.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class FirstSpringMVC {
	
	@GetMapping
	@RequestMapping("/login")
	public ModelAndView loginPageController() {
		ModelAndView ref=new ModelAndView();
		ref.addObject("login","here");
		ref.setViewName("login");
		return ref;
	}
	
	@GetMapping
	@RequestMapping("/register")
	public ModelAndView registerPageController() {
		ModelAndView ref=new ModelAndView();
		ref.addObject("register","here");
		ref.setViewName("register");
		return ref;
	}
	
}
