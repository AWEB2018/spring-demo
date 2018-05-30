package com.dac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dac.jdbc.DemoJdbc1;

public class Main {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
	
	public static void main(String args[]) {
		DemoJdbc1 ref = (DemoJdbc1)context.getBean("refJdbc");
		ref.readAll();
	}
}
