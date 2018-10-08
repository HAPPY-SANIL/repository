package com.nissan.training.corejava.oops;

public class InnerDemo {

	public static void main(String[] args) {
	Outer o=new Outer();
	o.m1();
	/*Outer.Inner oi=o.new Inner();
	oi.m1();*/
	Outer.Inner.m2();
	
	

	}
	static {
		System.out.println("hai i am static block");
	}
}
   

class Outer{
	static int a=10;
	void m1() {
		System.out.println(a+"outer");
	}
	
	static class Inner{
		int b=0;
		static void m2() {
			System.out.println(a+"inner");
		}
	}
}