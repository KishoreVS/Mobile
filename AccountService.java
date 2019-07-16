package com.bank.service;

import com.bank.bean.Account;

public interface AccountService {

    Account getAccountDetails(String mobileNo);

    int rechargeAccount(String mobileNo,double rechargeAmount);
}