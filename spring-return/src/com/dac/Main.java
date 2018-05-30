package com.dac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String args[]) {
		Sample sample = (Sample)context.getBean("bean1");
		String str = sample.sayHie();
		
		System.out.println(str);
	}
}
