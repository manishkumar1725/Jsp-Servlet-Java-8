package com.rashmi.jabc.JDBCSpringSecond;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class ProductMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		User user = new User();

		user.setId(rs.getInt(1));
		user.setUserName(rs.getString(2));
		user.setPassword(rs.getString(3));
		return user;

	}

}
