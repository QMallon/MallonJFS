package com.Capgemini.exceptions;

public class InvalidAccountNumberException extends Exception {
private static final String message ="ACCOUNT NUMBER ALREADY EXISTS OR IS INVALID";
public InvalidAccountNumberException() {
	super(message);
}
public InvalidAccountNumberException(String input) {
	super(input);
}
}
