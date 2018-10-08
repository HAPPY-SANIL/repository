package com.nissan.training.corejava.collection;

public class Singleton {
	private static Singleton s=null;
	
	private Singleton() {
		System.out.println("i am singleton");
	}
	
	public static Singleton getInstance() {
		if(s==null) {
			s=new Singleton();
		}
		return s;
	}

}
