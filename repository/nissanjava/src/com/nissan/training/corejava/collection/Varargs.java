package com.nissan.training.corejava.collection;

import com.nissan.training.corejava.collection.EnumExample.Season;

class A{
	int a,b;
	void add(int a,int...b) {
		for(int x:b) {
			System.out.println(a+" "+x);
		}
	}
}
public class Varargs {
	public static void main(String[] args) {
		A a1=new A();
		a1.add(10,20,30,40,50);
		Season s=Season.FALL;
		System.out.println(s);
	}

}
