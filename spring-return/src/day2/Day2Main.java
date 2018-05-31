package day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Day2Main {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("day2.xml");
	
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		System.out.println(context);
		
		DemoSample ref1 = (DemoSample)context.getBean("ref1");
		System.out.println(ref1.sayHie());
	}
}
