 package com.cg.pecunia.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.pecunia.bean.Account;
import com.cg.pecunia.bean.Slip;
import com.cg.pecunia.exception.AccountException;

public class AccountDaoImpl implements AccountDAO {
	
	private Map<Integer,Account> map;
	public AccountDaoImpl()
	{
		map= new HashMap<Integer,Account>();
	}
	
	@Override
	public int creditSlip(Slip slip) throws AccountException {
		
		return 0;
	}
	@Override
	public int debitSlip(Slip slip) throws AccountException {
		
		return 0;
	}
	@Override
	public int updateBalance(Slip slip) throws AccountException {
		
		return 0;
	}

}





