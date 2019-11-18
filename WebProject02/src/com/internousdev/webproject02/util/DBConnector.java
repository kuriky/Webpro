package com.internousdev.webproject02.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
		/**
		 * *JDBCドライバー名
		 */
	public static String driverName = "com.mysql.jdbc.Driver";
		/**
		 * データベース接続URL
		 */
	public static String url = "jdbc:mysql://localhost/testdb02";
		/**
		 * データベースユーザー名
		 */
	public static String user = "root";
		/**
		 * データベースパスワード
		 */
	public static String password = "mysql";

public Connection getConnection(){
	Connection con = null;
	try{
		Class.forName(driverName);
		con = DriverManager.getConnection(url,user,password);
	}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}
	return con;
}
}
