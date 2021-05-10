package com.capgemini.FirstMavenProject;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainapp {
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Employee emp = (Employee)context.getBean("obj");

		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress().toString());
		
		
		Employee emp2 = (Employee)context.getBean("obj2");

		System.out.println(emp2.getId());
		System.out.println(emp2.getName());
		System.out.println(emp2.getAddress().toString());
		
		
	}
	

}
