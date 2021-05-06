package com.Capgemini.Repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Capgemini.Beans.Account;

class AccountRepositoryImplTest {
private AccountRepositoryImpl repository;
	@BeforeEach
	void setUp() throws Exception {
		repository = new AccountRepositoryImpl();
		Account a = new Account(1, 500);
		Account b = new Account(2, 500);
		Account c = new Account(3, 500);
		
		repository.addAccount(a);
		repository.addAccount(b);
		repository.addAccount(c);
	}

	@Test
	void addAccount() {
		Account d = new Account(4, 500);
		repository.addAccount(d);
		assertTrue(repository.getAccount(4).isPresent());
		
	}
	@Test
	void getAccountValid() {
		assertTrue(repository.getAccount(1).isPresent());
	}
	@Test
	void getAccountInvalid() {
		assertFalse(repository.getAccount(10).isPresent());
	}
	@Test
	void updateAccount() {
		
		Account a = repository.getAccount(1).get();
		a.setAmount(300);
		repository.updateAccount(a);
		a = repository.getAccount(1).get();
		assertTrue(a.getAccountNumber() == 1 && a.getAmount() == 300);
	}


}
