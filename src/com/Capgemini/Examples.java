package com.Capgemini;

import java.util.Scanner;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Division
	
		int a = 10;
		int b = 6;
		
		float ans;
		ans = a / b;
		System.out.println(ans = a/b);
		System.out.println(ans = (float)a/b);
		
		Scanner scn = new Scanner(System.in);
		
		
		int [] ary1 = new int[10];
		int [] ary2 = new int[10];
		int counter = 0;
		int counter2 = 1;
		for(int y = 0; y< ary1.length; y++) {
			ary1[y] = counter;
			counter ++;
			ary2[y] = counter2;
			counter2++;
		}
		
		
		for(int z = 0; z< ary1.length; z++) {
			System.out.println(ary1[z] + ary2[z]);
		}
		
		Student ex1 = new Student();
		ex1.setName("Quinn");
		ex1.setID(1);
		ex1.output();
		
		
		
		
		//controls
		System.out.println("Please enter an integer");
		int num = scn.nextInt();
		Boolean prime = true;
		for(int x = 2; x<=num/2; x++) {
			if(num % x == 0) {
				prime = false;
				
			}
			if(!prime) {
				break;
			}
		}
		if(prime) {
			System.out.println(num + " Is prime");
		}
		else {
			System.out.println(num + " Is not prime");
		}
		
		
		
		
		
	}

}
