package com.java8bank.online_banking_uis.dao;

import com.java8bank.online_banking_uis.account.AccountInfo;

public interface UserDao {
	int saveInfoUser(AccountInfo user);
}
