package com;

public class Static_Newstatic {
public static int wheels=2;
public int price=3000;
public static void byke(){
	
}
	public void byke2(){
		System.out.println("calling static::"+wheels);
	}
	
	
	public static void main(String[] args) {
	Static_Newstatic.byke();
	Static_Newstatic s=new Static_Newstatic();
	s.byke2();
	s.byke();
	System.out.println(s.wheels);
	System.out.println(s.price);
	

	}

}
