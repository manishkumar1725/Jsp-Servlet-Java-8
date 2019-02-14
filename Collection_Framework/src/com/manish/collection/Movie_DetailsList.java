package com.manish.collection;

import java.util.Scanner;

public class Movie_DetailsList {
	

public static void main(String args[])
{
	
	Scanner enter = new Scanner(System.in);
	
    System.out.println("Enter What Operation You Want To Perform");
	System.out.println("--------------------------------");
	System.out.println("1.Add Movie");
	System.out.println("2.Remove Movie");
	System.out.println("3.Remove All Movies");
	System.out.println("4.Find Movie By Movie Name");
	System.out.println("4.Find Movie By Genre");
	int num;
	
	num=enter.nextInt();
	
	switch(num)
	{
	case 1: add_movie();
	         
	case 2: remove_movie();  
	
	case 3: remove_AllMovieS();
	
	case 4:find_movie_By_mov_Name();
	
	case 5:find_movie_By_mov_Genre();
   
	}
}

private static void find_movie_By_mov_Genre() {
	// TODO Auto-generated method stub
	
}

private static void find_movie_By_mov_Name() {
	// TODO Auto-generated method stub
	
}

private static void remove_AllMovieS() {
	// TODO Auto-generated method stub
	
}

private static void remove_movie() {
	// TODO Auto-generated method stub
	
}

private static void add_movie() {
	
	Scanner enter = new Scanner(System.in);
	String m_name;
	String actor_name;
	String actress_name;
	String genre;
	
	System.out.println("Enter Movie Name,Actor Name,Actress Name and Genre.");
	
	m_name=enter.next();
	actor_name=enter.next();
	actress_name=enter.next();
	genre=enter.next();
	
	
	
}
}
