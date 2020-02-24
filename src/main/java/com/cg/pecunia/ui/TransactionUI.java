package com.cg.pecunia.ui;

import java.util.Scanner;

import com.cg.pecunia.dao.TransactionDao;
import com.cg.pecunia.dao.TransactionDaoImpl;

public class TransactionUI {
	static TransactionDao transactionservice=new TransactionDaoImpl();
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[]args) {
		for(;;) {
			int choice;
			System.out.println("Enter your choice");
			System.out.println("1.credit using slip");
			System.out.println("2.debit using slip");
			System.out.println("3.Exit");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				creditUsingSlipInfo();
				break;
			case 2:
				debitUsingSlipInfo();
				break;
			case 3:
				System.out.println("THANK YOU");
					System.exit(0);
					break;
			 default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}
	private static void creditUsingSlipInfo() {
		System.out.println("Enter user name");
		String userName=scanner.next()+scanner.nextLine();
		System.out.println("enter account number");
		String accountNumber=scanner.next();
		System.out.println("enter amount to be credited");
		double amount=scanner.nextInt();
		
		if(transactionservice.creditUsingSlip( userName, accountNumber,amount)) {
			System.out.println("amount deposited successfully");
		}
	}
	private static void debitUsingSlipInfo() {
		System.out.println("Enter user name");
		String userName=scanner.next()+scanner.nextLine();
		System.out.println("enter account number");
		String accountNumber=scanner.next();
		System.out.println("enter amount to be debited");
		double amount=scanner.nextInt();
		
		if(transactionservice.debitUsingSlip( userName, accountNumber,amount)) {
			System.out.println("amount withdrawn successfully");
		}
	}
}
