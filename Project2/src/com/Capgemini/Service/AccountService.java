package com.Capgemini.Service;

public interface AccountService {
	
public String createAccount(int accountNum, double amount);
public String depositAmount(int accountNum, double amount);
public String withdrawAmount(int accountNum, double amount);
public String fundTransfer(int uAccount, double amount, int tAccount);

}
