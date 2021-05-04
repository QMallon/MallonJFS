package com.Capgemini.practice;

public class abstractinheritance extends AbstractExample implements interfacetest{
	String example;
	public abstractinheritance() {
		
	}
	public abstractinheritance(String example) {
		this.example = example;
	}
	
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	@Override
	public float divide(float a, float b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
