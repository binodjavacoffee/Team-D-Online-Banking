package com.java8bank.online_banking_uis.accservice;

import com.java8bank.online_banking_uis.account.AccountInfo;
import com.java8bank.online_banking_uis.dao.UserDao;
import com.java8bank.online_banking_uis.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	UserDao userDao= new UserDaoImpl();
	@Override
	public int saveInfoUser(AccountInfo user) {
		
		return userDao.saveInfoUser(user);

}
}