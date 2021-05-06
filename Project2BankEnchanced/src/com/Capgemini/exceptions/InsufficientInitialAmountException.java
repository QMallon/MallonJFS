package com.Capgemini.exceptions;

public class InsufficientInitialAmountException extends Exception {
	private static final String message = "Insuficient Inital Amount";
	
	
	public InsufficientInitialAmountException() {
		super(message);
	}


}
