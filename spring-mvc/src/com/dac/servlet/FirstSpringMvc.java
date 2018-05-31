package com.dac.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * http://localhost:8080/spring-mvc/spring/
 */
@Controller
@RequestMapping("/")
public class FirstSpringMvc {
	
	@Autowired
	private SampleDao sampleDao;

	/**
	 * http://localhost:8080/spring-mvc/spring/1
	 */
	@GetMapping
	@RequestMapping("/1")
	public ModelAndView sayHie() {
		
		ModelAndView ref = new ModelAndView();
		
		sampleDao.readAll();
		ref.addObject("firstName", "CDAC KHARGHAR!!!");
		
		ref.setViewName("first");
		return ref;
	}
	
	
	
	
}
