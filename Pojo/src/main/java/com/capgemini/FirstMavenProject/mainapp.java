package com.capgemini.FirstMavenProject;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainapp {
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Employee emp = (Employee)context.getBean("obj");

		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
	}
	

}
