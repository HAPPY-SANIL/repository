package com.nissan.training.corejava.functionalinterface;

public class Test2 {
	
	public static void main(String[] args) {
		//lambda expression to create the object
		new Thread(()->
		{System.out.println("new thread created");}).start();
	}

}
