package com.Capgemini;

public class Parent {
	private int age;
	private String lastName;
	protected int test1 = 1;
	int test2 = 2;
	public int test3 = 3;
	public Parent() {
		
	}
	public Parent(int age, String lastname) {
		this.age = age;
		this.lastName = lastname;
	}
	public void output() {
	System.out.println("PARENT CLASS");
	}
	

}
