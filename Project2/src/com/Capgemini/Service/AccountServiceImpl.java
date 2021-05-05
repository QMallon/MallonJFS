package com.Capgemini.Service;

import com.Capgemini.Beans.Account;
import com.Capgemini.Repository.AccountRepository;
import com.Capgemini.Repository.AccountRepositoryImpl;
import com.Capgemini.exceptions.*;

public class AccountServiceImpl implements AccountService {
	private final AccountRepository accountRepository;
	public AccountServiceImpl() {
		this.accountRepository = new AccountRepositoryImpl();
		
	}
	@Override
	public String createAccount(int accountNum, double amount)  {
		// TODO Auto-generated method stub
		try {
			Account nAccount = new Account(accountNum, amount);
			if(amount<500.0) {
				throw new InsufficientInitialAmountException();
			}
			
			if(accountRepository.checkAccountNum(accountNum)) {
				throw new InvalidAccountNumberException();
			}
			accountRepository.addAccount(nAccount);
		}
		catch(InsufficientInitialAmountException e) {
			return "Error"+ e.getMessage();
		}
		catch(InvalidAccountNumberException e) {
			return "Error"+ e.getMessage();
		}
		catch(Exception e) {
			return "Error"+ e.getMessage();
		}
		
		return "Account Created";
	}
	@Override
	public String depositAmount(int accountNum, double amount) {
		// TODO Auto-generated method stub
		String output;
		try {
			if(accountRepository.checkAccountNum(accountNum)) {
				Account currentAcount = accountRepository.getAccount(accountNum);
				currentAcount.setAmount(currentAcount.getAmount() + amount);
				accountRepository.updateAccount(currentAcount);
				output = Double.toString(currentAcount.getAmount());
			}
			else {
				throw new InvalidAccountNumberException();
			}
		
		}
		catch(InvalidAccountNumberException e){
			return "Error"+ e.getMessage();
		}
		catch(Exception e) {
			return "Error"+ e.getMessage();
		}
		return "Deposit Complete new balance: " + output;
	}
	@Override
	public String withdrawAmount(int accountNum, double amount) {
		// TODO Auto-generated method stub
		String output = "0";
		try {
			if(accountRepository.checkAccountNum(accountNum)) {
				Account currentAcount = accountRepository.getAccount(accountNum);
				if(currentAcount.getAmount() < amount) {
					throw new InsufficientBalanceException();
				}
				else {
					currentAcount.setAmount(currentAcount.getAmount() - amount);
					accountRepository.updateAccount(currentAcount);
					output = Double.toString(currentAcount.getAmount());
				}
				
				
			}
			else {
				throw new InvalidAccountNumberException();
			}
		
		}
		catch(InvalidAccountNumberException e){
			return "Error "+ e.getMessage();
		}
		catch(InsufficientBalanceException e){
			
			return "Error "+ e.getMessage();
		}
		
		
		return "Withdraw Complete new balance: " + output;
	}
	@Override
	public String fundTransfer(int uAccount, double amount, int tAccount) {
		// TODO Auto-generated method stub
		String output ="0";
		try {
			if(uAccount == tAccount) {
				throw new InvalidAccountNumberException("Cannot transfer to same account");
			}
			if(accountRepository.checkAccountNum(uAccount)) {
				Account currentAcount = accountRepository.getAccount(uAccount);
				if(currentAcount.getAmount() < amount) {
					throw new InsufficientBalanceException();
				}
				else {
					currentAcount.setAmount(currentAcount.getAmount() - amount);
				}
				if(accountRepository.checkAccountNum(tAccount)) {
					Account transferTarget = accountRepository.getAccount(tAccount);
					transferTarget.setAmount(transferTarget.getAmount() + amount);
					
					output = Double.toString(currentAcount.getAmount());
					accountRepository.updateAccount(currentAcount);
					accountRepository.updateAccount(transferTarget);
					
					
				}
				else {
					throw new InvalidAccountNumberException("Target Account Invalid");
				}
				
				
				
				
				
				
				
			}
			else {
				throw new InvalidAccountNumberException("InitialAccountNumber Invalid");
			}
			
			
		}
		catch(InvalidAccountNumberException e) {
			
			return "error " + e.getMessage();
		}
		catch(InsufficientBalanceException e) {
			
			return "error " + e.getMessage();
		}
		catch(Exception e) {
			
			return "error " + e.getMessage();
		}
		return "Transfer Complete new balance: " + output;
	}
	public String printAll() {
		return accountRepository.toString();
	}

}
