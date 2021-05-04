package com.Capgemini;

public class Child extends Parent {
	private int number;
	public Child() {
		
	}
	public Child(int number, int age, String lastName) {
		super(age, lastName);
		this.number = number;
	}
	public void testParent() {
		int testVal;
		testVal = this.test1; //dif class same pkg prot
		System.out.println(testVal);
		testVal =  this.test2; //dif class same pkg default
		System.out.println(testVal);
		testVal = this.test3; //diff class same pkg public
		System.out.println(testVal);
		//this.name Cannot access is private
		//super.testP();
	}
	
	public void output() {
		System.out.println("CHILD CLASS");
	}
	public void superandthis() {
		super.output();
		this.output();
		
	}

}
