package com.cg.pecunia.exception;

public class amountLessException extends Exception {
	
		amountLessException(String msg){
			super(msg);
		}
	}
	class AccountException extends Exception{
		AccountException(String msg){
			super(msg);
		}
	}

