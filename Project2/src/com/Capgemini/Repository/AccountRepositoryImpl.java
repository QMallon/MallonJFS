package com.Capgemini.Repository;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import com.Capgemini.Beans.Account;
import com.Capgemini.exceptions.*;

public class AccountRepositoryImpl implements AccountRepository{
public LinkedList<Account> accounts = new LinkedList<Account>();
	@Override
	public Account getAccount(int accountNum) {
		// TODO Auto-generated method stub
		/*ListIterator<Account> it = accounts.listIterator();
		
			
		while(it.hasNext()) {
			if(it.next().getAccountNumber()==accountNum) {
				return it.next();
			}
		}
		*/
		
		
		for(Account n : accounts) {
			if(n.getAccountNumber() == accountNum) {
				return n;
			}
		}
	
		return null;
	}

	@Override
	public void addAccount(Account a)  {
		// TODO Auto-generated method stub
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


