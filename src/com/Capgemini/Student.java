package com.Capgemini;

public class Student {
	private String Name;
	private int studentID;
	
	public Student() {
		
	};
	
	
	public Student(String name, int id ) {
		this.Name= name;
		this.studentID = id;
	}
	
	public void getName() {
		System.out.println(Name);
	}
	public void setName(String name) {
		this.Name = name;
	}
	
	public void getID() {
		System.out.println(studentID);
	}
	public void setID(int id) {
		this.studentID = id;
	}
	
	public void output() {
		System.out.println( "Name: " + Name + " ID:" + studentID);
	}

}
