package com;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		for(int i=0;i<=5;i++){
			System.out.println("enter the grade");
	String grade=input.nextLine();
		
		switch(grade)
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
        System.out.println("Unmatched grade");
		}
		}
		System.out.println("=================");
		
		String fruits="A";
				switch(fruits)
				{
				case "A":
						System.out.println("Fruit A");
				break;
				case "B":
					System.out.println("Fruit B");
				break;
				case "C":
				System.out.println("Fruit C");
				break;
				case "G":
				System.out.println("Fruit G");
				break;
				default:
					System.out.println("Fruit not available");
				}
		
		
		
	}

}
