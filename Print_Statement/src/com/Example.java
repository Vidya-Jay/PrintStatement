package com;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	
		/*String grade="X";
		switch (grade)
		{
			case "A":
				System.out.println("Grade A");
				break;
			case "B":
				System.out.println("Grade B");
				break;
			case "C":
				System.out.println("Grade C");
				break;
			case "D":
				System.out.println("Grade D");
				break;
				default:
					System.out.println("not matching");
				
		}*/
	//Single dimension array
		/*int num[]=new int[4];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		num[3]=400;
		
		System.out.println(num[3]);
		System.out.println("length of array:"+num.length);
		
		for (int each:num){
			System.out.println(each);
		}
	System.out.println("*********************");
	
	for(int i=0;i<num.length;i++){
		System.out.println(num[i]);
	}
	*/
		
		//object array
		
		/*Object Str[]=new Object[4];
		Str[0]="India";
		Str[1]=100;
		Str[2]='d';
		Str[3]=234.54;
		System.out.println("length of Str::"+Str.length);
		 for (Object arr:Str){
			 System.out.println(arr);
		 }
		System.out.println("************************");
		for (int i=0;i<Str.length;i++){
			System.out.println(Str[i]);
		}*/
		
		// multi dimensional object array
		
		Object [][] login= new Object[3][2];
		//first row first column
		login[0][0]="user1";
		//first row second column
		login[0][1]=1234;
		//second row first column
		login[1][0]="user2";
		//second row second column
		login[1][1]=5678;
		//third row first column
		login[2][0]="user3";
		//third row second column
		login[2][1]=91011;
	System.out.println("length of row::"+login.length);
	System.out.println("length of column::"+login[0].length);
	for(int i=0;i<login.length;i++)
	{
		for(int j=0;j<login[0].length;j++)
		{
			//System.out.println(login[i][j]);
		
			//to print in a newline
			//System.out.print("\n"+login[i][j]);
		//to print in a table format
		System.out.print("\t"+login[i][j]);
	}
	
	
		System.out.println();
	}
	
}
}