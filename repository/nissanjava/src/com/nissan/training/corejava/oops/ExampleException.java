package com.nissan.training.corejava.oops;
public class ExampleException {
public static void main(String[] args) {
	excep();
	System.out.println();
	System.out.println();
}
static void excep() {
	try {
		int a[]= {1,2,3,4};
		System.out.println(a[6]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e+"fsfs");
		}
		finally {
			System.out.println("in finally");
		}
	
}
}
