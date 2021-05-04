package com.capgemini.service;

import com.capgemini.beans.Student;

public class StudentScheduler {
	private Student[] students = new Student[10];
	private int counter = 0;
	
	
	public String addStudent(int rollNum, String name, String[] courses) {
		String output;
		for(int x =0; x<counter; x++) {
			if(students[x].getRollNum() == rollNum) {
				return "Roll number already in use";
			}			
		}
		if(counter>9) {
			return "Student limit reached";
		}
		else {
			students[counter++] = new Student(rollNum, name, courses);	
			return "Student added succesfully";
		}
		
		
		
		
		
	}


	public String getStudent(int rollEntry) {
		// TODO Auto-generated method stub
		for(int x =0; x<counter; x++) {
			if(students[x].getRollNum() == rollEntry) {
				return students[x].toString();
			}
			
		}
		return "No student exists";
		
	}


	public void getStudentbyClass(String next) {
		// TODO Auto-generated method stub
		Student[] inClass = new Student[10];
		int inClasscounter =0;
		String[] courses ;
		for(int x =0; x<counter; x++) {
			courses = students[x].getCourses();
			for(int y = 0; y<courses.length; y++) {
				if(courses[y].equals(next)) {
					inClass[inClasscounter++] = students[x];
				}
			}
			
		}
		
		for(int z = 0; z<inClasscounter; z++) {
			System.out.println(inClass[z].toString());
		}
		if(inClasscounter==0) {
			System.out.println("No students in" + next);
		}
		
	}


	public void getAllStudents() {
		// TODO Auto-generated method stub
		for(int x = 0 ; x<counter;x++) {
			System.out.println(students[x].toString());
		}
		
	}

}
