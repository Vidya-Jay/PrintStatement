package com;

import java.util.Scanner;

public class Conditional_statements {

	public static void main(String[] args) {
		/*int marks=10;
		if(marks>=35) {
			System.out.println("pass::"+marks);
		}
		else
		{
			System.err.println("fail::"+marks);

		}
	
		System.out.println("==============================");
*/	Scanner s=new Scanner(System.in);
			for(int i=1;i<=5;i++)
			{
				System.out.println("enter a value");
		int a=s.nextInt();
						
				if ((a>=1) && (a<100))
			{
			System.out.println("a is a small number");
			}
			else if ((a>100) && (a<=1000))
			{
				System.out.println("a is medium number");
			}
	        else if (a>1000)
	        {
	        	System.out.println("a is a big number");
	        }
	        else 
	        	
	        {
	        	System.out.println("a is either negative or zero");
				}
	      
	        }
	
	
	}

}
