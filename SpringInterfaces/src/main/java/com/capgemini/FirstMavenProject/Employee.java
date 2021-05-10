package com.capgemini.FirstMavenProject;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements DisposableBean, InitializingBean{
	private int id;
	private String name;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address.getCity();
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("EMPLOYEE CREATED");
		
	}
	@Override
	public void destroy() throws Exception {
		
		System.out.println("Destroyed");
		
	}

}
