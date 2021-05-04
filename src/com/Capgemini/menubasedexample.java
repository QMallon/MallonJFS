package com.Capgemini;

import java.util.Scanner;

public class menubasedexample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int controller = 0;
		int a,b;
		while(controller != 5){
			System.out.println("Please Choose and option");
			System.out.println("1.Add\n2.subtract\n3.Multiply\n4.Divide\n5.Exit");
			controller = scn.nextInt();
			
			
			switch(controller){
			case 1: 
				System.out.println("Please enter two numbers");
				a = scn.nextInt();
				b = scn.nextInt();
				int sum = a+b;
				System.out.println(a + " + " + b + " = " + sum);
				
				break;
			case 2:
				System.out.println("Please enter two numbers");
				a = scn.nextInt();
				b = scn.nextInt();
				int sub = a-b;
				System.out.println(a + " - " + b + " = " + sub);
				break;
			case 3:
				System.out.println("Please enter two numbers");
				a = scn.nextInt();
				b = scn.nextInt();
				int product = a*b;
				System.out.println(a + " * " + b + " = " + product);
				break;
			case 4:
				System.out.println("Please enter two numbers");
				a = scn.nextInt();
				b = scn.nextInt();
				float div = a/b;
				System.out.println( a + " / " + b + " = " + div);
				break;
			case 5:
				System.out.println("Closing");
				break;
			default: 
				System.out.println("Please enter a valid number");
				break;
			}
		}
		
		
		

	}

}
