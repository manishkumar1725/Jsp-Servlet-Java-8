package com.rashmi.jabc.JDBCSpringSecond;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		
UserDAOImpl dao = (UserDAOImpl) context.getBean("userdao");
		
System.out.println("Data Added");
		dao.add(new User("name1", "pass1", 1));
		
dao.add(new User("name2", "pass2", 2));
		
dao.add(new User("name3", "pass3", 3));
		
		
System.out.println("=======================================");
		
		
System.out.println("Data Deleted");
		
dao.remove(1);
		
		
System.out.println("=======================================");
		
		
System.out.println("Data Updated");
		
dao.update(new User("name1", "name2", 3));
		
		
System.out.println("=======================================");
		
		
System.out.println("Product Contains == " + dao.isContain(2));
		
		
System.out.println("=======================================");
		
		
System.out.println("User Detail");
		
List<User> list1 = dao.getUserDetail(105);
		
for (User user : list1)
			
System.out.println(user);
		
		
System.out.println("=======================================");
		
		
System.out.println("User Details");
		
dao.getAllDetails();
	
	List<User> list = dao.getAllDetails();
		
for (User product : list)
			
System.out.println(product);
		
System.out.println("=======================================");
	}
}

