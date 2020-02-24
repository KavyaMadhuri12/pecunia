package com.cg.pecunia.exception;

public class AmountLessException extends Exception {
	
		AmountLessException(String msg){
			super(msg);
		}
	}
	class AccountException extends Exception{
		AccountException(String msg){
			super(msg);
		}
	}

