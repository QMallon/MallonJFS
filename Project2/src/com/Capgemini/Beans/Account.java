package com.Capgemini.Beans;

public class Account {
private int accountNumber;
private double amount;
public Account() {
	
}
public Account(int accountNumber, double amount) {
	this.accountNumber = accountNumber;
	this.amount = amount;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String toString() {
	return "AccountNumber: " + this.accountNumber +" Amount: " + this.amount;
}
}
