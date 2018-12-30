package com;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Return_types {
	public double x=23,y=34,z;
	public int a=23,b=34,c;
	public static void message(){
		System.out.println("message");
	}
	public double div(){
		z=x/y;
		return z;
	}
  
	public int intdiv(){
		c=a/b;
		return c;
		
	}
	public static void main(String[] args) {
		Return_types.message();
		Return_types s=new Return_types();
        System.out.println(s.div());
		System.out.println(s.intdiv());

	}

}
