package com.zto.app13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBDAO {

	private String driver;
	private String url;
	private String user;
	private String password;
	private Connection conn;
	private Statement sta;
	private ResultSet rs;
	
	//构造函数初始化函数
	public DBDAO(){
		driver="com.mysql.jdbc.Driver";
		url="jdbc:mysql://localhost:3306/test";
		user="root";
		password="123456";
	}
	
	//获取连接对象
	public void getConnection(){
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage()+"找不到驱动类");
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"连接数据库异常");
		}
	}
	
	//执行所有查询语句的方法
	public ResultSet queryDB(String sql){
		getConnection();
		try {
			sta=conn.createStatement();
			rs=sta.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"sql语句异常");
		}
		return rs;
	}
	
	//执行所有dml语句的方法
	public int updateDB(String sql){
		int num=-1;
		getConnection();
		try {
			sta=conn.createStatement();
			num=sta.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"sql语句异常");
		}
		
		return num;
	}
	
	//关闭资源
	public void close(){
		try {
			if(rs!=null)rs.close();
			if(sta!=null)sta.close();
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"关闭资源异常");
		}
	}
	
	
	
	
}
