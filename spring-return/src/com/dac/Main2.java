package com.dac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String args[]) {
		Sample sample = (Sample)context.getBean("bean1");
		String str = sample.sayHie();
		System.out.println(str);
		System.out.println(sample.getTitle());
		
		
		// CHECK SECOND BEAN
		Sample bean2 = (Sample)context.getBean("bean2");
		System.out.println(bean2.getTitle());
		
		
		// ASSOCIATION :: COMPOSTION :: HASA
		Company comp1 = (Company)context.getBean("comp1");
		String s1 = comp1.getEmp().getFullname();
		System.out.println(s1);
		
		Company comp2 = (Company)context.getBean("comp2");
		String s2 = comp2.getEmp().getFullname();
		System.out.println(s2);
	}
}
