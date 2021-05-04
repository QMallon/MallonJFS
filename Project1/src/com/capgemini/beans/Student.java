package com.capgemini.beans;

public class Student {
	private int rollNum;
	private String name;
	private String[] Courses;
	private int courseCount;
	
	public Student(int rollNum, String name, String[] courses) {
		this.rollNum = rollNum;
		this.name = name;
		this.Courses = courses;
		courseCount = courses.length;
		
	}
	
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getCourses() {
		return Courses;
	}
	public void setCourses(String[] courses) {
		Courses = courses;
		courseCount = courses.length;
	}
	public String toString() {
		String output = "RollNum: " + this.rollNum +"\nName: " + this.name + "\nCourses:";
		for(int x =0 ; x<courseCount; x++) {
			output += this.Courses[x] + "\n";
		}
		
		
		return output;
	}
	
	

}
