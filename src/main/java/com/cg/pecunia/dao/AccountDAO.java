package com.cg.pecunia.dao;

import com.cg.pecunia.bean.Account;
import com.cg.pecunia.bean.Slip;
import com.cg.pecunia.exception.AccountException;

public interface AccountDAO {

public int creditSlip(Slip slip) throws AccountException;
public int debitSlip(Slip slip) throws AccountException;
public int updateBalance(Slip slip) throws AccountException;
}
