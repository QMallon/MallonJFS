package com.capgemini.FirstMavenProject;



import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainapp {
	public static void main(String []args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			
			Employee emp = (Employee)context.getBean("employee");
			
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getAddress());
		}
		catch(BeanCreationException e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
