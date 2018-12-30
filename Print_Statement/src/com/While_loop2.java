package com;

public class While_loop2 {

	public static void main(String[] args) {
		int i=0;
		while(i<=20)
		{
			System.out.println(i);
			i=i+2;
		}
		System.out.println("======================");
		
		int a=20;
				while (a>=10)
				{
					System.out.println(a);
					a-=2;
				}
	
        System.out.println("========================");
        
        int b = 20;
        do{
        System.out.println(b);
        b-=2;
        }
      while (b>10);
        
        System.out.println("=========================");
        
        String weekdays[]= {"sun","mon","tue","wed","thu","fri","sat"};
        for (String eachdays:weekdays)
        {
        	System.out.println(eachdays);
        }   
        System.out.println("============================");
        
        for(int c=0;c<weekdays.length;c++)
        {
        	System.out.println(weekdays[c]);
        }
	}

}
