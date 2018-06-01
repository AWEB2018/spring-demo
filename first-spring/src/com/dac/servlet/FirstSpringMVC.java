package com.dac.servlet;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.jdt.internal.compiler.parser.ParserBasicInformation;
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
	
	@PostMapping
	@RequestMapping("/login-action")
	public ModelAndView loginActionController(HttpServletRequest req ) {
		ModelAndView ref=new ModelAndView();
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		
		if("".equalsIgnoreCase(uname)) {
			ref.addObject("USERNAME_MISSING", "User Name Missing");
		}
		
		boolean result=userDao.loginUser(uname, pwd);
		if(result) {
			req.getSession().setAttribute("UNAME", uname);
			req.getSession().setAttribute("AUTH_SUCCESS", true);
			return this.homePageController(req);
			//ref.setViewName("home");
		}
		else {
			ref.addObject("ERROR", "Authentication Fails!!");
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
		
		if("".equalsIgnoreCase(uname)) {

			ref.addObject("USERNAME_MISSING", "Username cant be empty");
			ref.setViewName("register");
		} else {
			userDao.createUser(uname, pwd, fname, lname, mobile);
			ref.setViewName("login");
		}
		
		return ref;
	}
	
	
	
	@GetMapping
	@RequestMapping("/home")
	public ModelAndView homePageController(HttpServletRequest req) {
		ModelAndView ref=new ModelAndView();
		
		if(req.getSession().getAttribute("AUTH_SUCCESS") != null) {
			List<Map<String, Object>> userList = userDao.readAll();
			ref.addObject("userList", userList);
			
			ref.setViewName("home");
		} else {
			
			ref.addObject("ERROR", "Login required.");
			ref.setViewName("login");
		}
		
		
		return ref;
	}
	
	
	@GetMapping
	@RequestMapping("/logout")
	public ModelAndView logOut(HttpServletRequest req) {
		ModelAndView ref = new ModelAndView();
		
		// KEY TO REMOVE SESSSION
		req.getSession().removeAttribute("AUTH_SUCCESS");
		
		ref.setViewName("login");
		return ref;
	}
	
	
	@GetMapping
	@RequestMapping("/deleteUser")
	public ModelAndView deleteUser(HttpServletRequest req) {
		ModelAndView ref = new ModelAndView();
		
		String sid = req.getParameter("id");
		
		int id = Integer.parseInt(sid);
		userDao.deleteUser(id);
		
		return this.homePageController(req);
		
	}
	
	
}
