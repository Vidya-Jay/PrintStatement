package com;

public class throws_interrupted_exception {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hi!!!"+"\nsleeping for 5 seconds");
		Thread.sleep(5000);
		System.out.println("i am back");
		
		System.out.println("hi!!!"+"\nsleeping for 5 seconds");
		Thread.sleep(5000);
		System.out.println("i am back");

	}

}
