package com.rashmi.jabc.JDBCSpringSecond;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAOImpl implements UserDAO {

	String query;

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean add(User user) {
		query = "insert into UserInfo values('" + user.getId() + "','"+ user.getUserName() + "','" + user.getPassword() + "')";
		jdbcTemplate.execute(query);
		return true;
	}

	@Override
	public boolean remove(int id) {
		query = "delete from UserInfo where id=" + id;
		jdbcTemplate.execute(query);
		return true;
	}

	@Override
	public boolean update(User user) {
		query = "update UserInfo set UserName='" + user.getUserName()+ "',password='" + user.getPassword()
				+ "' where id='" + user.getId() + "'";
		jdbcTemplate.execute(query);
		return true;
	}

	
	public List<User> getUserDetail(int id) {
	 query = "select * from UserInfo where id=" + id;
		List<User> product = jdbcTemplate.query(query, new ProductMapper());
		return product;

	}

	
	public List<User> getAllDetails() {
		String query = "select * from UserInfo";
		List<User> product = jdbcTemplate.query(query, new ProductMapper());
		return product;
	}

	
	public boolean isContain(int id){ 
		Boolean status=false;
		String query="select * from UserInfo where id="+id;  
	    List <User> product  = jdbcTemplate.query(query,new ProductMapper()); 
	    int value=product.size();
	    if(value>0)
    	status=true;
	    return status;
	}
}
