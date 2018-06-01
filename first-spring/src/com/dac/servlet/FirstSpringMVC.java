package com.dac.servlet;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class FirstSpringMVC {
	
	@Autowired
	private UserDao userDao;
	
	@GetMapping
	@RequestMapping("/login")
	public ModelAndView loginPageController() {
		ModelAndView ref=new ModelAndView();
		
		
		ref.setViewName("login");
		return ref;
	}
	
	@GetMapping
	@RequestMapping("/login-action")
	public ModelAndView loginActionController(HttpServletRequest req ) {
		ModelAndView ref=new ModelAndView();
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		
		boolean result=userDao.loginUser(uname, pwd);
		if(result) {
			ref.setViewName("home");
		}
		else {
			ref.setViewName("login");
		}
		
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
	
	@PostMapping
	@RequestMapping("/register-action")
	public ModelAndView registerActionController(HttpServletRequest req) {
		ModelAndView ref=new ModelAndView();
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String mobile=req.getParameter("mobile");
		
		
		userDao.createUser(uname, pwd, fname, lname, mobile);
		
		ref.setViewName("login");
		return ref;
	}
	
	
	
	@GetMapping
	@RequestMapping("/home")
	public ModelAndView homePageController() {
		ModelAndView ref=new ModelAndView();
		
		List<Map<String, Object>> userList = userDao.readAll();
		ref.addObject("userList", userList);
		
		ref.setViewName("home");
		return ref;
	}
}
