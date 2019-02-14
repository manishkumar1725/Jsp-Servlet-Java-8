package com.project.shoppingproject.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.project.shoppingproject.Interface.IDAO;
import com.project.shoppingproject.pojo.User;

public class UserDAOImpl implements IDAO{
	
	private JdbcTemplate jdbcTemplate;

	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int add(User user) {
		 
		String query = "insert into User1 values('" + user.getEmaiId()
		+ "','" +user.getUserId() + "','"
		+ user.getName() + "','"
		+user.getPhoneNo()  +"', '"+user.getPassword() + "')";
		return jdbcTemplate.update(query);
	}

	public int update(User user ) {
		String query = "update User1 set emailId='"
				+ user.getEmaiId() + "',name='"
				+ user.getName() + "',password='"
				+ user.getPassword() + "' where userId='"
				+ user.getUserId() +"',phoneNo='"+user.getPhoneNo()+ "' ";
		return jdbcTemplate.update(query);
		
	}

	public double remove(double userId) {
		String query = "delete from User1 where userId='"
				+ userId + "' ";
		return jdbcTemplate.update(query);
		
	}

	

	public List<User> getAll() {
		return jdbcTemplate.query("select * from User1",
				new ResultSetExtractor<List<User>>() {
					
					public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<User> list = new ArrayList<User>();
						while (rs.next()) {
							User user = new User();
							user.setEmaiId(rs.getString(1));
							user.setUserId(rs.getDouble(2));
							user.setName(rs.getString(3));
							user.setPhoneNo(rs.getDouble(4));
							user.setPassword(rs.getString(5));
							
							list.add(user);
						}
						return list;
					}

				});
	}



	public void get() {
		// TODO Auto-generated method stub
		
	}
}
