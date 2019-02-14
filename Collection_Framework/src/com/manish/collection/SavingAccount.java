package com.manish.collection;

import java.util.Comparator;

public class SavingAccount {
	
	public String accountHoldername;
	public int acc_balance;
	public int acc_id;
	public boolean isSalaryAccount;
	
	
	
	public SavingAccount(String accountHoldername, int acc_balance, int acc_id,boolean isSalaryAccount) 
	{
		
		this.accountHoldername = accountHoldername;
		this.acc_balance = acc_balance;
		this.acc_id = acc_id;
		this.isSalaryAccount = isSalaryAccount;
	}


    //GETTERS METHOD...
	
	public String getAccountHoldername() {
		return accountHoldername;
	}



	public int getAcc_balance() {
		return acc_balance;
	}



	public int getAcc_id() {
		return acc_id;
	}



	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}


	

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	//SETTERS METHOD...
	
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}


	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}


	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}


	@Override
	public String toString() 
	{
		return "SavingAccount [accountHoldername=" + accountHoldername
				+ ", acc_balance=" + acc_balance + ", acc_id=" + acc_id
				+ ", isSalaryAccount=" + isSalaryAccount + "]";
	}

   
	public void withdraw(double amount)
	{
		this.acc_balance-=amount;

		if(this.acc_balance<amount)
		{
			System.out.println("Please enter correct amount!!");
		}
		
		else if(this.acc_balance <1000)
		{
			System.out.println("Amount is less than 1000");
		}
		else 
			System.out.println("The Remanining account balance is:"+this.acc_balance);
		
		
		
	}
	public void deposit(double amount)
	{
		this.acc_balance+=amount;
		
		 System.out.println("The Updated account balance is:"+this.acc_balance);
	}
	
	
	
}
class Id_Comp implements Comparator<SavingAccount>
{
	 
    
	public int compare( SavingAccount person1, SavingAccount person2) {
		
		if(person1.getAcc_id() > person2.getAcc_id())
		{
			return 1;
		}
		else if(person1.getAcc_id() == person2.getAcc_id())
		{
			return 0;
		}
		else 
			return -1;
		
		
}
}

