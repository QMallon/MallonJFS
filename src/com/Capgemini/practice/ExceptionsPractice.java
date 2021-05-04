package com.Capgemini.practice;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		try {
			System.out.println("Please enter a number to divide 100");
			div(scn.nextInt());
			
		}
		catch(InputMismatchException me) {
			System.out.println("Input was not an integer");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank you for testing ");
		}

	}
	
	public static void div(int x) throws ArithmeticException,  Exception {
		System.out.println( 100 / x);
	}

}
