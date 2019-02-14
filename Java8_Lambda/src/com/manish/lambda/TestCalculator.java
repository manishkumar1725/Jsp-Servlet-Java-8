package com.manish.lambda;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		
		int num_1=input.nextInt();
		int num_2=input.nextInt();
		
		Calculator divide = (int num1 , int num2)-> {
			
			int var=0;
			try
			{
			    var=num1/num2;
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("Cannot Divide By Zero!!");
				
			}
			
			return var;
			};
		System.out.println("Value After Divison is:"+divide.calculate(num_1,num_2));
		
		
		Calculator add = (int num1 , int num2)->num1+num2;
		System.out.println("Value After Addition is:"+add.calculate(num_1,num_2));
		
		Calculator subtract = (int num1 , int num2)->num1-num2;
		System.out.println("Value After Subtraction is:"+subtract.calculate(num_1,num_2));
		
		Calculator multiply = (int num1 , int num2)->num1*num2;
		System.out.println("Value After Multiplication is:"+multiply.calculate(num_1,num_2));

	}

}
