package com.Capgemini.Service;

import java.util.Optional;

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
	public String createAccount(int accountNum, double amount)throws InvalidAccountNumberException , InsufficientInitialAmountException  {
		// TODO Auto-generated method stub
		
			Account var = new Account(accountNum, amount);
			if(amount<500.0) {
				throw new InsufficientInitialAmountException();
			}
			
			if(accountRepository.checkAccountNum(accountNum)) {
				throw new InvalidAccountNumberException();
			}
			accountRepository.addAccount(var);
		
		
		return "Account Created";
	}
	@Override
	public String depositAmount(int accountNum, double amount)throws InvalidAccountNumberException {
		// TODO Auto-generated method stub
		String output ="";
		Account currentAcount = accountRepository.getAccount(accountNum).orElseThrow(InvalidAccountNumberException::new);
			//accountRepository.getAccount(accountNum).get();
			currentAcount.setAmount(currentAcount.getAmount() + amount);
			accountRepository.updateAccount(currentAcount);
			output = Double.toString(currentAcount.getAmount());
		
		
	
		/*
			if(accountRepository.checkAccountNum(accountNum)) {
				Account currentAcount = accountRepository.getAccount(accountNum).get();
				
			}
			else {
				throw new InvalidAccountNumberException();
			}
*/			
		
		
		
		return "Deposit Complete new balance: " + output;
	}
	@Override
	public String withdrawAmount(int accountNum, double amount) throws InvalidAccountNumberException, InsufficientBalanceException   {
		// TODO Auto-generated method stub
		String output = "0";
		Account currentAccount = accountRepository.getAccount(accountNum).orElseThrow(InvalidAccountNumberException::new);
			
				if(currentAccount.getAmount() < amount) {
					throw new InsufficientBalanceException();
				}
				else {
					currentAccount.setAmount(currentAccount.getAmount() - amount);
					accountRepository.updateAccount(currentAccount);
					output = Double.toString(currentAccount.getAmount());
				}
				
				
			
		
		
		
		
		
		return "Withdraw Complete new balance: " + output;
	}
	@Override
	public String fundTransfer(int uAccount, double amount, int tAccount) throws InvalidAccountNumberException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		String output ="0";
		String var = "0";
		
		Account currentAccount = accountRepository.getAccount(uAccount).orElseThrow(InvalidAccountNumberException::new);
		Account targetAccount = accountRepository.getAccount(tAccount).orElseThrow(InvalidAccountNumberException::new);
		
		if(uAccount == tAccount) {
			throw new InvalidAccountNumberException("Cannot transfer to same account");
		}
		
			if(currentAccount.getAmount() < amount) {
				throw new InsufficientBalanceException();
			}		
			
				targetAccount.setAmount(targetAccount.getAmount() + amount);
				currentAccount.setAmount(currentAccount.getAmount() - amount);
				output = Double.toString(currentAccount.getAmount());
				var = Double.toString(targetAccount.getAmount());
				accountRepository.updateAccount(currentAccount);
				accountRepository.updateAccount(targetAccount);

		
		return "Transfer Complete new balance thisAccount: " + output + "TargetBalance: " + var ;
	
}
	public String printAll() {
		return accountRepository.toString();
	}

}
