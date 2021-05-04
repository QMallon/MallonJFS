package com.Capgemini.practice;

public class inheritanceexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee test1 = new Developer();
		Employee test2 = new Tester();
		Employee test3 = new Employee();
		
		test1.show();
		test2.show();
		test3.show();
		
		Developer t1 = (Developer) test1;
		t1.show();
		Tester t2 = (Tester) test2;
		t2.show();
		//Developer t3 = (Developer)test3;
		//test3.show();
		
		
		
		Developer test4 = new Developer(10,5);
		
		System.out.println(test4.a);
		
		abstractinheritance test5 = new abstractinheritance("test");
		System.out.println(test5.function(10, 20));
		Developer q = (Developer)test2;
		q.show();

	}

}
