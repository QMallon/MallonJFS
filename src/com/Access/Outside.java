package com.Access;

import com.Capgemini.Parent;


public class Outside extends Parent {
	public Outside(int age, String Name) {
		super(age,Name);
		System.out.println(this.test1 + " Protected From subclass in different pkg");
	}

}
