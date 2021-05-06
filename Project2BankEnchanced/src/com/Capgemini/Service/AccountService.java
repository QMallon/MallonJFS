package com.Capgemini.Service;

import com.Capgemini.exceptions.InsufficientBalanceException;
import com.Capgemini.exceptions.InsufficientInitialAmountException;
import com.Capgemini.exceptions.InvalidAccountNumberException;

public interface AccountService {
	
public String createAccount(int accountNum, double amount) throws InvalidAccountNumberException,  InsufficientInitialAmountException;
public String depositAmount(int accountNum, double amount) throws InvalidAccountNumberException;
public String withdrawAmount(int accountNum, double amount)throws InvalidAccountNumberException, InsufficientBalanceException;
public String fundTransfer(int uAccount, double amount, int tAccount)throws InvalidAccountNumberException, InsufficientBalanceException;

}
