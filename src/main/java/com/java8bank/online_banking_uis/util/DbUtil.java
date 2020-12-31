package com.java8bank.online_banking_uis.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	
	public static final String URL = "jdbc:mysql://localhost:3306/banking_db";
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root1234";
	public static final String SQL = "create database bankingonline_db";
	public static final String TBL = "create table account_tbl(id int not null auto_increment, account_name varchar(100),account_no  bigint(100), acc_ssn bigint(100), acc_email varchar(150), acc_address varchar(150), acc_phoneno bigint(100), primary key(id))";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER_NAME);
		return DriverManager.getConnection(URL, USER_NAME, PASSWORD);

}
}