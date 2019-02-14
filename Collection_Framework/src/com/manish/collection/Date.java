package com.manish.collection;

public class Date{
	
	
	int dd;
	int mm;
	int yyyy;
	
	
	public Date(int dd, int mm, int yyyy)
	{
		
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public int getDd() {
		return dd;
	}


	public int getMm() {
		return mm;
	}


	public int getYyyy() {
		return yyyy;
	}
	


	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}
	
	
}
	
/*class DateComp implements Comparator<Date>
	
	{
    public int compare(Date person1, Date person2)
	{
		if((person1.getDd()== person2.getDd() && person1.getMm()== person2.getMm()))
				{
			        return 0;
				}
		else
			return 1;
	}
  

}*/




