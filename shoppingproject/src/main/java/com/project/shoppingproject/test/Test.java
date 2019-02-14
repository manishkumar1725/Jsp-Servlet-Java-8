package com.project.shoppingproject.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.shoppingproject.DAO.UserDAOImpl;
import com.project.shoppingproject.pojo.User;  


public class Test {  

public static void main(String[] args) {  
    ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  
    UserDAOImpl dao=(UserDAOImpl)context.getBean("UserDaoImpl"); 
    
    dao.add(new User("ak@gmail.com", 1, "Ashutrosh", 12345, "Ashu"));
 //   dao.add(new User("as@gmail.com", 2, "Ashna", 123456, "Ashna"));
//    dao.remove(1);
//    dao.update(new User("pu@gmail.com", 3, "pujita", 123, "pujita"));
   
/*    dao.getAll();
  
    List<User> list=dao.getAll();  
          
    for(User user:list)  
     */ 
    //System.out.println(user);
}  
}  