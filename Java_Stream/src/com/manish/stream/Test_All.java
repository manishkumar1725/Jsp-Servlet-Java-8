package com.manish.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test_All{

	public static void main(String[] args) 
	{
		// FRUIT DATA..	
		
		ArrayList<Fruit> fruit = new ArrayList<Fruit>();
		
		 fruit.add(new Fruit("Mango",132,15,"Yellow"));
		 fruit.add(new Fruit("Apple",96,20,"Red"));
		 fruit.add(new Fruit("Banana",76,18,"Yellow"));
		 fruit.add(new Fruit("Orange",110,13,"Orange"));
		 fruit.add(new Fruit("Guava",86,10,"Green"));
		 fruit.add(new Fruit("Pineapple",130,25,"Green"));
		 fruit.add(new Fruit("Cherry",60,7,"Red"));
		 fruit.add(new Fruit("Strawberry",70,11,"Red"));
		
	    // NEWS DATA..
		
		ArrayList<News> news = new ArrayList<News>();
		
		 news.add(new News(12,"Manish","Rishav","Budget"));
		 news.add(new News(12,"Amit","Manish","Good"));
		 news.add(new News(12,"Rahul","Amit","Budget"));
		 news.add(new News(13,"Soham","Rahul","Average"));
		 news.add(new News(13,"Manish","Amit","Good"));
		 news.add(new News(14,"Tiger","Manish","Budget"));
		 news.add(new News(14,"Ravi","Manish","Average"));
		 news.add(new News(10,"Simer","Suraj","Budget"));
		
		
		// TRADER DATA..
		
		ArrayList<Trader> trader = new ArrayList<Trader>();	
		
		  trader.add(new Trader("Manish","Delhi"));
		  trader.add(new Trader("Amit","Kolkata"));
		  trader.add(new Trader("Rishav","Pune"));
		  trader.add(new Trader("Soham","Delhi"));
		  trader.add(new Trader("Nitish","Pune"));  
		  trader.add(new Trader("Pradeep","Indore"));
		  trader.add(new Trader("Satyam","Pune"));
		  trader.add(new Trader("Ravi","Indore"));
		
		 //TRANCATION DATA..
		  
		 ArrayList<Transaction> transaction = new ArrayList<Transaction>();	
		
		  transaction.add(new Transaction(new Trader("Manish","Delhi"),2011,5000));
		  transaction.add(new Transaction(new Trader("Amit","Kolkata"),2012,6000));
		  transaction.add(new Transaction(new Trader("Rishav","Pune"),2011,3000));
		  transaction.add(new Transaction(new Trader("Soham","Delhi"),2010,4000));
		  transaction.add(new Transaction(new Trader("Nitish","Pune"),2012,7000));
		  transaction.add(new Transaction(new Trader("Pradeep","Indore"),2011,2000));
		  transaction.add(new Transaction(new Trader("Satyam","Pune"),2012,9000));
		  transaction.add(new Transaction(new Trader("Ravi","Indore"),2011,5000));
		  
		  
		//QUESTION NUMBER 1. 
		
		System.out.println("QUESTION NUMBER 1.");
		
		ArrayList<Fruit> fruit_1 = (ArrayList<Fruit>) fruit.stream().filter(i -> i.getCalories()<100).collect(Collectors.toList());
			
		ArrayList<Fruit> fruit_2 = (ArrayList<Fruit>) fruit_1.stream().sorted((fruit1,fruit2) -> (fruit1.getCalories()<fruit2.getCalories())?1:fruit1.getCalories()>fruit2.getCalories()?-1:0).collect(Collectors.toList());
		
		
		for(Fruit i : fruit_2)
		{
			
			System.out.println(i);
		}
		
		// QUESTION NUMBER 2.
		
		System.out.println("----------------------------------");	
		System.out.println("QUESTION NUMBER 2.");
		
		ArrayList<Fruit> fruit_3 = (ArrayList<Fruit>) fruit.stream().sorted((color1,color2)->color1.getColor().compareTo(color2.getColor())).collect(Collectors.toList());
		
		for(Fruit i : fruit_3)
		{
			System.out.println(i);
		}
		
		// QUESTION NUMBER 3.
		
	    System.out.println("----------------------------------");
	    System.out.println("QUESTION NUMBER 3.");
		ArrayList<Fruit> fruit_4 = (ArrayList<Fruit>) fruit.stream().filter(i->i.getColor().equals("Red")).collect(Collectors.toList());
		
		ArrayList<Fruit> fruit_5 = (ArrayList<Fruit>) fruit_4.stream().sorted((price1,price2) -> (price1.getPrice()>price2.getPrice())?1:price1.getPrice()<price2.getPrice()?-1:0).collect(Collectors.toList());
		
		for(Fruit i : fruit_5)
		{
			System.out.println(i);
		}
		
		// QUESTION NUMBER 4.
		
		System.out.println("----------------------------------");
		System.out.println("QUESTION NUMBER 4.");
		
				
		ArrayList<Integer> news_1=(ArrayList<Integer>) news.stream().map(index -> index.getNewsId()).collect(Collectors.toList());
				
		//System.out.println(news_1);
				
		Map<Integer,Long> news_2=(Map<Integer, Long>) news_1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				
		//System.out.println(news_2);
		
		int key=0;
		long max=0;
		
		for(Map.Entry<Integer,Long> entry :news_2.entrySet())
		{		if( entry.getValue()>max)
			{
				max=entry.getValue();
				key=entry.getKey();
			}
	    }
		System.out.println("The Id Which is Repeated Maximum Time is:"+key+" And Total No. of comment is :"+max);
		
        //QUESTION NUMBER 5.
		
	    System.out.println("----------------------------------");
	    System.out.println("QUESTION NUMBER 5.");
			
	    long news_5= news.stream().filter(i->i.getComment().contains("Budget")).count();
	    
	    System.out.println(news_5);
		
        //QUESTION NUMBER 6.
	    
	    System.out.println("----------------------------------");
	    System.out.println("QUESTION NUMBER 6.");
	    
	    ArrayList<String> news3=(ArrayList<String>) news.stream().map(index -> index.getCommentByUser()).collect(Collectors.toList());
	    
	    //System.out.println(news_3);
	    
	    Map<String,Long> news4=(Map<String, Long>) news3.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    
	    //System.out.println(news_4);
	    
	    String key1=null;
		long max1=0;
		
		for(Map.Entry<String,Long> entry :news4.entrySet())
		{
			if( entry.getValue()>max1)
			{
				max1=entry.getValue();
				key1=entry.getKey();
			}
	    }
	    System.out.println("Maximum Comment By User is :"+key1+" And Number Of Comment is :"+max1);
	    
		
		//QUESTION NUMBER 7.
	    
	    System.out.println("----------------------------------");
	    System.out.println("QUESTION NUMBER 7.");
	    
	    ArrayList<String> news_3=(ArrayList<String>) news.stream().map(index -> index.getCommentByUser()).collect(Collectors.toList());
	    
	    //System.out.println(news_3);
	    
	    Map<String,Long> news_4=(Map<String, Long>) news_3.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    
	    System.out.println(news_4);
	    
		
		//QUESTION NUMBER 8.
		
		System.out.println("----------------------------------");
	    System.out.println("QUESTION NUMBER 8.");
				
		ArrayList<Transaction> transaction_1=(ArrayList<Transaction>) transaction.stream().filter(i->i.getYear()==2011).collect(Collectors.toList());
				
		//System.out.println(transaction_1);
				
		ArrayList<Transaction> transaction_2=(ArrayList<Transaction>) transaction_1.stream().sorted((value1,value2) -> (value1.getValue()>value2.getValue())?1:(value1.getValue()<value2.getValue()?-1:0)).collect(Collectors.toList());
			
		System.out.println(transaction_2);
		
		// QUESTION NUMBER 9.
		
		System.out.println("----------------------------------");
		System.out.println("QUESTION NUMBER 9.");
		
	    List<String> trader_4 = trader.stream().map(i->i.getCity()).collect(Collectors.toList());
		 
		//System.out.println(trader_4);
	
		List<String> trader_5=(List<String>)trader_4.stream().distinct().collect(Collectors.toList());
	
		System.out.println(trader_5);
		
		//QUESTION NUMBER 10.
		
		System.out.println("----------------------------------");
		System.out.println("QUESTION NUMBER 10.");
				
				
		ArrayList<Trader> trader_1=(ArrayList<Trader>) trader.stream().filter(i->i.getCity()=="Pune").collect(Collectors.toList());
				
		ArrayList<Trader> trader_2 = (ArrayList<Trader>) trader_1.stream().sorted((name1,name2) -> name1.getName().compareTo(name2.getName())).collect(Collectors.toList());
				
		System.out.println(trader_2);
		
        //QUESTION NUMBER 11..
		
	    System.out.println("----------------------------------");
	    System.out.println("QUESTION NUMBER 11.");
			
	    ArrayList<String >trader_6= (ArrayList<String>) trader.stream().map(i->i.getName()).collect(Collectors.toList());
			 
	    //System.out.println(trader_6);
	    
	    ArrayList<String >trader_7= (ArrayList<String>) trader_6.stream().sorted().collect(Collectors.toList());
	    
	    System.out.println(trader_7);
		
		//QUESTION NUMBER 12.
		
		System.out.println("----------------------------------");
		System.out.println("QUESTION NUMBER 12.");
		
	    ArrayList<Trader> trader_3=(ArrayList<Trader>) trader.stream().filter(i->i.getCity()=="Indore").collect(Collectors.toList());
		
		System.out.println(trader_3);
		
		//QUESTION NUMBER 13.
		
		System.out.println("----------------------------------");
		System.out.println("QUESTION NUMBER 13.");
		
		ArrayList<Transaction> transaction_3=(ArrayList<Transaction>) transaction.stream().filter(i->i.getTrader().getCity()=="Delhi").collect(Collectors.toList());
		
		System.out.println(transaction_3);
		
		//QUESTION NUMBER 14.
		
		System.out.println("----------------------------------");
		System.out.println("QUESTION NUMBER 14.");
		
		Transaction transaction_4= transaction.stream().max(Comparator.comparing(Transaction :: getValue)).get();
		 
		System.out.println(transaction_4);
		 
		//QUESTION NUMBER 15.
			
	    System.out.println("----------------------------------");
	    System.out.println("QUESTION NUMBER 15.");
			
	    Transaction transaction_5= transaction.stream().min(Comparator.comparing(Transaction :: getValue)).get();
			 
	    System.out.println(transaction_5);
	    
	    
        
	    
	}

}
