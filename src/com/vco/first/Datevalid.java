package com.vco.first;

public class Datevalid {
	public static void test(int day,int month,int year)
	{
		if(day>31)
		{
			System.out.println("invalid day");
		}
		if(month>12 )
		{
			System.out.println("invalid month");
		}
		if(year>2200 || year<1900)
		{
			System.out.println("year is invalid");
		}
	}
		
	public static void main(String[] args) {
		
		test(12,24,2225);
		
		

	}






}
