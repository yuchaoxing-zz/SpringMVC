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
	
	//���캯����ʼ������
	public DBDAO(){
		driver="com.mysql.jdbc.Driver";
		url="jdbc:mysql://localhost:3306/test";
		user="root";
		password="123456";
	}
	
	//��ȡ���Ӷ���
	public void getConnection(){
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage()+"�Ҳ���������");
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"�������ݿ��쳣");
		}
	}
	
	//ִ�����в�ѯ���ķ���
	public ResultSet queryDB(String sql){
		getConnection();
		try {
			sta=conn.createStatement();
			rs=sta.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"sql����쳣");
		}
		return rs;
	}
	
	//ִ������dml���ķ���
	public int updateDB(String sql){
		int num=-1;
		getConnection();
		try {
			sta=conn.createStatement();
			num=sta.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"sql����쳣");
		}
		
		return num;
	}
	
	//�ر���Դ
	public void close(){
		try {
			if(rs!=null)rs.close();
			if(sta!=null)sta.close();
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"�ر���Դ�쳣");
		}
	}
	
	
	
	
}
