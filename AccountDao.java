package com.bank.dao;

import com.bank.bean.Account;

public interface AccountDao {

    Account getAccountDetails(String mobileNo);

    int rechargeAccount(String mobileNo,double rechargeAmount);
}