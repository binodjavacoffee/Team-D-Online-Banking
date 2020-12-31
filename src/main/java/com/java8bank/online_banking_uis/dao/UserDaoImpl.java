package com.java8bank.online_banking_uis.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java8bank.online_banking_uis.account.AccountInfo;
import com.java8bank.online_banking_uis.util.DbUtil;

public class UserDaoImpl implements UserDao {
public static final String SAVE_SQL="insert into account_tbl (account_name,account_no,acc_ssn,acc_email, acc_address, acc_phoneno )values(?,?,?,?,?,?)";
	@Override
	public int saveInfoUser(AccountInfo user) {
		int saved = 0;
		try(PreparedStatement ps=DbUtil.getConnection().prepareStatement(SAVE_SQL);){
			ps.setString(1,user.getAccountName());
			ps.setLong(2, user.getAccountNo());
			ps.setLong(3, user.getSsn());
			ps.setString(4,user.getEmail());
			ps.setString(5,user.getAddress());
			ps.setLong(6,user.getMobileNo());
			saved=ps.executeUpdate();
			
			
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return saved;
	}
}
 