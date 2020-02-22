package com.cg.pecunia.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.pecunia.dao.TransactionDao;
import com.cg.pecunia.dao.TransactionDaoImpl;

class TransactionTest {
	
	TransactionDao transactionDao = null;
	
	@BeforeEach 
	void setUp() {
		transactionDao = new TransactionDaoImpl();
	}

	@Test
	void testCreditUsingSlip() {
		boolean flag = transactionDao.creditUsingSlip("Kavya", "123456789012", 200000);
		
		assertEquals(false, flag);
	}
	@Test
	void testDebitUsingSlip() {
		boolean flag = transactionDao.debitUsingSlip("Kavya", "123456789012", 200000);
		
		assertEquals(false, flag);
	}
}
