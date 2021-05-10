package com.capgemini.FirstMavenProject;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component

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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
