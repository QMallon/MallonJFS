package com.Capgemini.exceptions;

public class InsufficientBalanceException extends Exception {
	static final String message = "InsufficientBalance for transaction";
public InsufficientBalanceException() {
	super(message);
}
}
