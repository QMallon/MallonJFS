package com.capgemini.FirstMavenProject;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private String name;
	@Autowired
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
	
	public void init(){
		
		System.out.println("EMPLOYEE CREATED");
		
	}
	
	public void destroy(){
		
		System.out.println("EMPLOYEE CREATED");
		
	}

}
