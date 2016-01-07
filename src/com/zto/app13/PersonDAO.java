package com.zto.app13;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO extends DBDAO{

	
	public List<Person> findAll(){
		List<Person> list=new ArrayList<Person>();
		String sql="SELECT * FROM PERSON";
		ResultSet rs=queryDB(sql);
		try {
			while(rs.next()){
				Person person=new Person();
				person.setPersonid(rs.getInt(1));
				person.setPersonname(rs.getString(2));
				person.setIdcard(rs.getString(3));
				list.add(person);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"PersonDAO.findAll()---");
		}
		return list;
	}
}
