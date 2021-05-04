package com.Capgemini.practice;

public class Employee {
int a = 10;
public Employee() {
	
}
public Employee(int b) {
	a = b;
}
public void show() {
	System.out.println("Employee + " + a);
	
	
}
}

class Developer extends Employee{
	int a =15;
	
	public Developer() {
		
	}
	public Developer(int b, int c) {
		super(b);
		System.out.println("This a = " + this.a + "\nSuper a = " + super.a);
		if(super.a>this.a) {
			System.out.println(this.a + c);
		}
		else {
			System.out.println(super.a + c);
		}
		
	}
	public void show() {
		System.out.println("Developer + " + a);
	}
	
}
class Tester extends Employee{
	int a =20;
	public void show() {
		System.out.println("Tester + " + a);
	}
	
}
