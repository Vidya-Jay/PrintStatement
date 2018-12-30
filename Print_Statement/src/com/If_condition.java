package com;

import java.util.Scanner;

public class If_condition {

	public static void main(String[] args) {
		int marks=25;
				if (marks>=35)
					System.out.println("pass::"+marks);
				else
					System.out.println("fail::"+marks);
				
				System.out.println("===================");
				Scanner s = new Scanner(System.in);
				for (int i=1;i<=5;i++) {
				System.out.println("enter a value");
		
				int a = s.nextInt();
				
				
						if ((a>=1) && (a<100)) {
							System.out.println("A is a small number");
						}
						else if ((a>100) && (a<1000)){
							System.out.println("A is a medium number");
						}
							else if ((a>1000)) {
								System.out.println("A is a big number");
							}
							else {
								System.out.println( "A is either negative or zero");
							}
				}
	}
}

				
							
				
					
	
	



