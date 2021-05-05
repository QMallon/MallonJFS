package com.Capgemini.Repository;

import java.util.LinkedList;

import com.Capgemini.Beans.Account;
import com.Capgemini.exceptions.InsufficientInitialAmountException;;

public interface AccountRepository {
	public LinkedList<Account> accounts = new LinkedList<Account>(); ;
public Account getAccount(int accountNum);
public void addAccount(Account a) ;
public boolean checkAccountNum(int accountNum);
public void updateAccount(Account a);

}
