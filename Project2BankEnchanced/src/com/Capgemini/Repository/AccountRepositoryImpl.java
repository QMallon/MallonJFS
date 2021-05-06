package com.Capgemini.Repository;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Optional;

import com.Capgemini.Beans.Account;
import com.Capgemini.exceptions.*;

public class AccountRepositoryImpl implements AccountRepository{
	
	
private LinkedList<Account> accounts;

public AccountRepositoryImpl() {
	this.accounts = new LinkedList<Account>();
}
	@Override
	public Optional<Account> getAccount(int accountNum) {
		
		/*ListIterator<Account> it = accounts.listIterator();
		
			
		while(it.hasNext()) {
			if(it.next().getAccountNumber()==accountNum) {
				return it.next();
			}
		}
		*/
		Optional<Account> account ;
		
		
		for(Account n : accounts) {
			if(n.getAccountNumber() == accountNum) {
				account = Optional.of(n);
				return account;
			}
		}
	
		return account= Optional.empty();
	}

	@Override
	public void addAccount(Account a)  {
		
		accounts.add(a);
	}
	public void updateAccount(Account a){	
		if(checkAccountNum(a.getAccountNumber()))
		{
			for(Account b :accounts) {
				if(b.getAccountNumber() == a.getAccountNumber())
				{
					b = a;
				}
		
		}
	}
	}
	public boolean checkAccountNum(int accountNum) {
		ListIterator<Account> it = accounts.listIterator();
		while(it.hasNext()) {
			if(it.next().getAccountNumber()==accountNum) {
				return true;
			}
		}
		
			return false;
		}
	}


