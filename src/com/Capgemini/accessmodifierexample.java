package com.Capgemini;

public class accessmodifierexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testVal;
		Parent test = new Parent(30,"Name");
		//System.out.println(test.lastName); //diff class samepkg
		testVal = test.test1; //dif class same pkg prot
		System.out.println(testVal);
		testVal =  test.test2; //dif class same pkg default
		System.out.println(testVal);
		testVal = test.test3; //diff class same pkg public
		System.out.println(testVal);
		
		Child test2 = new Child(20,5, "Name");
		test2.testParent();
		
	}

}
