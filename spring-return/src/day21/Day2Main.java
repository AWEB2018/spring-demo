package day21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Day2Main {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("day21.xml");
	
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		System.out.println(context);
		
		Library lib1 = (Library)context.getBean("lib1");
		System.out.println(lib1);
	}
}
