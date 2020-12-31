package com.java8bank.online_banking_uis.controller;




import javax.swing.JOptionPane;

import com.java8bank.online_banking_uis.account.AccountInfo;
import com.java8bank.online_banking_uis.accservice.UserService;
import com.java8bank.online_banking_uis.accservice.UserServiceImpl;

public class BankController {

	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();

		AccountInfo user = getAccount();
		// userService.saveInfoUser(user);
		int saved = userService.saveInfoUser(user);
		if (saved >= 1) {
			System.out.println("Info saved successfully in db.");

		} else {
			System.out.println("There is an error in db.");
		}
	}

	public static AccountInfo getAccount() {
		AccountInfo user = new AccountInfo();

		String accountName = JOptionPane.showInputDialog("Enter the name:");
		long accountNo = Long.parseLong(JOptionPane.showInputDialog("Enter account number:"));
		String email = JOptionPane.showInputDialog("Enter your email :");
		long mobileNo = Long.parseLong(JOptionPane.showInputDialog("Enter mobile no:"));
		String address = JOptionPane.showInputDialog("Enter your address :");
		long ssn = Long.parseLong(JOptionPane.showInputDialog("Enter your ssn:"));
		user.setAccountName(accountName);
		user.setAccountNo(accountNo);
		user.setEmail(email);
		user.setMobileNo(mobileNo);
		user.setAddress(address);
		user.setSsn(ssn);
		return user;

	}

}
