package com;

public class String_functions {

	public static void main(String[] args) {
		/*String str1="hello";
		String str2="Hello";
		
		System.out.println(str1.equals(str2));
*/
		/*
		String str="I am learning testing";
				System.out.println(str.contains("Lea"));*/
		
	/*String str1="chen";
	String str2="nai";
	
	System.out.println(str1.concat(str2));
	*/
	
		/*String str="hello canada";
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf("o"));*/
		
		/*String val1="23";
		String val2="24";
		
		int x=Integer.parseInt(val1);
		int y=Integer.parseInt(val2);
		System.out.println(x+y);
		
		int a=100;
		System.out.println(String.valueOf(a));
		*/
		/*
		String str="     testing    ";
				System.out.println(str.trim());*/
		
		/*String str="Welcome into India";
				System.out.println(str.replace("into", "to"));
		*/
		String str="HCL@GOOGLE@IBM@TCS@INFOSYS@DELOITTE";
		String arrayvar[]=str.split("@");
				for(String each:arrayvar)
				{
					System.out.println(each);
				}
		
		
		
	}

}
