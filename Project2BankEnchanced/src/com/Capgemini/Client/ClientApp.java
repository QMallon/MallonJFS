package com.Capgemini.Client;

import java.lang.System.Logger;

import com.Capgemini.Service.AccountService;
import com.Capgemini.Service.AccountServiceImpl;
import com.Capgemini.exceptions.InsufficientBalanceException;
import com.Capgemini.exceptions.InsufficientInitialAmountException;
import com.Capgemini.exceptions.InvalidAccountNumberException;

public class ClientApp {
	public static AccountServiceImpl var = new AccountServiceImpl();

	public static void main(String[] args) {
		
		
		
		
		//Creating accounts
		System.out.println("Creating Accounts");
		
			
		
		addAccount(1, 300);
		addAccount(1, 500);
		addAccount(2, 600);
		addAccount(1, 600);
	
		
		//Depositing
		System.out.println("\nDeposits");
		deposit(1, 500.50);
		deposit(2, 500.50);
		
		//Withdraw
		System.out.println("\nWithdraw");
		withdraw(1, 200);
		withdraw(2, 2000);
		
		//Transfer
		System.out.println("\nTransfer");
		transfer(1, 200, 3);
		transfer(3, 200, 2);
		transfer(1, 2000, 2);
		transfer(1, 200, 2);
		
		
		
		
		
		
		//Accounts
		/*
		System.out.println("\nPrinting accounts");
		System.out.println(var.printAll());
		*/
		
		
		

	}
	public static void addAccount(int accountNum, double amount)  {
		try {
			System.out.println(var.createAccount(accountNum, amount));
		}
		catch(InvalidAccountNumberException e){
			System.out.println("Error " + e.getMessage());
			
		} catch (InsufficientInitialAmountException e) {
			
			System.out.println("Error  " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Error " + e.getMessage());
		}
	}
	public static void deposit(int accountNum, double amount) {
		try {
			System.out.println(var.depositAmount(accountNum, amount));
		}
		catch(InvalidAccountNumberException e){
			System.out.println("Error " + e.getMessage());
			
		} 
		catch(Exception e) {
			System.out.println("Error " + e.getMessage());
		}
	}
	public static void withdraw(int accountNum, double amount) {
		try {
			System.out.println(var.withdrawAmount(accountNum, amount));
		}
		catch(InvalidAccountNumberException e){
			System.out.println("Error " + e.getMessage());
			
		} 
		catch(InsufficientBalanceException e) {
			System.out.println("Error " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Error " + e.getMessage());
		}
	}
	public static void transfer(int uAccountNum, double amount, int tAccount) {
		try {
			System.out.println(var.fundTransfer(uAccountNum, amount, tAccount));
		}
		catch(InvalidAccountNumberException e) {
			System.out.println("Error " + e.getMessage());
		}
		catch(InsufficientBalanceException e){
			System.out.println("Error " + e.getMessage());
		}
	}
}
