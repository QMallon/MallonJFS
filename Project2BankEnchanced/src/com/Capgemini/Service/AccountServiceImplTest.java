package com.Capgemini.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Capgemini.Repository.AccountRepository;
import com.Capgemini.exceptions.InsufficientBalanceException;
import com.Capgemini.exceptions.InsufficientInitialAmountException;
import com.Capgemini.exceptions.InvalidAccountNumberException;

class AccountServiceImplTest  {
	private AccountServiceImpl var;
	
	@BeforeEach
	void setUp() throws InvalidAccountNumberException, InsufficientInitialAmountException {
		var= new AccountServiceImpl();
		var.createAccount(1, 500);
		var.createAccount(3, 500);
	}
	@Test
	void createAccountValid() throws InvalidAccountNumberException, InsufficientInitialAmountException {
		assertTrue(var.createAccount(2, 500).contains("Account Created"));
		
	}
	@Test
	void createAccountInvalidInit()  {
		assertThrows(InsufficientInitialAmountException.class, ()->var.createAccount(1, 200));
		//assertEquals("Insuficient Inital Amount", thrown.getMessage());	
		
	}
	@Test
	void createAccountInvalidId()   {
		
		assertThrows(InvalidAccountNumberException.class, ()->var.createAccount(1, 600));
		//assertEquals("ACCOUNT NUMBER ALREADY EXISTS OR IS INVALID", thrown.getMessage());	
	}

	@Test
	void withdrawTestCorrect() throws InvalidAccountNumberException, InsufficientBalanceException {
		
		assertTrue((var.withdrawAmount(1, 500).contains("Withdraw Complete")));
		
		
		
	}
	@Test 
	void withdrawTestBalanceError()  {
		
		assertThrows(InsufficientBalanceException.class, ()->var.withdrawAmount(1, 600));
		//assertEquals("InsufficientBalance for transaction", thrown.getMessage());		
		
	}
	@Test 
	void withdrawInvalidId() {
		
		Throwable thrown = assertThrows(InvalidAccountNumberException.class, ()->var.withdrawAmount(2, 600));
		assertEquals("ACCOUNT NUMBER ALREADY EXISTS OR IS INVALID", thrown.getMessage());		
		
	}
	@Test
	void depositTestValid() throws InvalidAccountNumberException {
		assertTrue(var.depositAmount(1, 200).contains("Deposit Complete"));
	}
	@Test
	void depositTestInvalid() {
		assertThrows(InvalidAccountNumberException.class, ()-> var.depositAmount(9, 100));
	}
	@Test
	void transferTestValid() throws InvalidAccountNumberException, InsufficientBalanceException {
		assertTrue((var.fundTransfer(1, 100, 3)).contains("Transfer Complete"));
	}
	@Test
	void transferTestInvalidUserId() {
		assertThrows(InvalidAccountNumberException.class, ()-> var.fundTransfer(99, 100, 1));
	}
	@Test
	void transferTestInvalidTargetId() {
		assertThrows(InvalidAccountNumberException.class, ()-> var.fundTransfer(1, 100, 99));
	}
	@Test
	void transferTestBalance()  {
		assertThrows(InsufficientBalanceException.class, ()-> var.fundTransfer(1, 1000, 3));
	}
	@Test
	void transferTestSameAct() {
		assertThrows(InvalidAccountNumberException.class, ()-> var.fundTransfer(1, 1000, 1));
	}

}
