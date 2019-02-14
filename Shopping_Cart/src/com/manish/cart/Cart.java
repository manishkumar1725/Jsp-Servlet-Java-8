package com.manish.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 RequestDispatcher requestDispatcher=null;
		 
		 ArrayList<Fashion> arrayList= getData();
		 
		//PrintWriter out=response.getWriter();
		 request.setAttribute("arrayList", arrayList);
		//out.print(arrayList);
	     requestDispatcher=request.getRequestDispatcher("/jsp/AddToCart.jsp");
	   
		requestDispatcher.forward(request, response);
			
			
	}

	 private ArrayList<Fashion> getData() 
	 {
		IfashionDAO ad= DAOUtility.getCartDao();
		return ad.getData();
		
	 }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	}


