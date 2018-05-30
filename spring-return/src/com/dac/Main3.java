package com.dac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dac.jdbc.DemoJdbc2;
import com.dac.jdbc.DemoJdbc3;

public class Main3 {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
	
	public static void main(String args[]) {
		DemoJdbc2 ref = (DemoJdbc2)context.getBean("refJdbc2");
		ref.readAll();
		
		DemoJdbc3 ref3 = (DemoJdbc3)context.getBean("refJdbc3");
		ref3.readByid();
		
		ref3.insertPost();
	}
}
