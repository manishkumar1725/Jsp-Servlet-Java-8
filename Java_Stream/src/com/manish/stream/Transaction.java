package com.manish.stream;

public class Transaction {
	
	Trader trader; 
	int year; 
	int value;
	
	public Transaction(Trader trader, int year, int value) 
	{
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	
	//GETTERS..
	
	public Trader getTrader() {
		return trader;
	}

	public int getYear() {
		return year;
	}

	public int getValue() {
		return value;
	}
     
	//SETTERS..
	
	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value="
				+ value + "]";
	}
	
}
