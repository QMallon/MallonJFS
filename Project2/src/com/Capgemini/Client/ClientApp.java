package com.Capgemini.Client;

import com.Capgemini.Service.AccountService;
import com.Capgemini.Service.AccountServiceImpl;
import com.Capgemini.exceptions.InsufficientBalanceException;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountServiceImpl client= new AccountServiceImpl();
		//client.createAccount(1, 200);
		//Creating accounts
		System.out.println("Creating Accounts");
		
			
		
		System.out.println(client.createAccount(1, 300));
		System.out.println(client.createAccount(1, 500));
		System.out.println(client.createAccount(2, 600));
		System.out.println(client.createAccount(1, 600));
	
		
		//Depositing
		System.out.println("\nDeposits");
		System.out.println(client.depositAmount(1, 500.50));
		System.out.println(client.depositAmount(2, 500.50));
		
		//Withdraw
		System.out.println("\nWithdraw");
		System.out.println(client.withdrawAmount(1, 200));
		System.out.println(client.withdrawAmount(1, 2000));
		
		//Transfer
		System.out.println("\nTransfer");
		System.out.println(client.fundTransfer(1, 200, 2));
		System.out.println(client.fundTransfer(1, 200,3));
		System.out.println(client.fundTransfer(3, 200,2));
		System.out.println(client.fundTransfer(1, 2000,2));
		
		
		
		
		
		//Accounts
		/*
		System.out.println("\nPrinting accounts");
		System.out.println(client.printAll());
		*/
		
		

	}

}
