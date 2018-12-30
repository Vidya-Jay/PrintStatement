package com;

public class For_loop {

	public static void main(String[] args) {
		for (int i=0; i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("============================");
		
		for(int i=0; i<=10;i+=2)
		{
			System.out.println(i);
		}
		
		System.out.println("==============================");
		
		for(int i=0;i<=10;i+=5)
		{		
	      System.out.println(i);
		}
	
        System.out.println("===============================");
        
        for(int i=10;i>=0;i--)
        {
        	System.out.println(i);
        }
        
        System.out.println("================================");
        
        for (int i=20;i>=10;i-=2)
        	
        {
        	
        	System.out.println(i);
        }
        
        System.out.println("=================================");
        
 int sum=0;
		 
		 for (int i=1;i<=20;i++)
		 {
			 sum=sum+i;
			 System.out.println(sum);
		 }
        
	}

}
