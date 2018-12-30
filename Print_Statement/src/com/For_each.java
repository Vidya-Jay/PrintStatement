package com;

public class For_each {

	public static void main(String[] args) {
		String weekdays[]= {"sun","mon","tue","wed","thu","fri","sat"};
		
		for (String eachday:weekdays)
		{
			System.out.println(eachday);
	}
		System.out.println("======================");
		for (int i=0; i<weekdays.length;i++)
		{
			System.out.println(weekdays[i]);
		}
	}

}
