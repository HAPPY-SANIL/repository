package com.nissan.training.corejava.functionalinterface;

@FunctionalInterface
interface Square
{
	static int a=10,b=20;
	int calculate(int x);
	default void show() {
		
	}
	default void disp(int x) {
		System.out.println(x);
	}
}
public class Test3  {
	public static void main(String[] args) {
		int a=5;
		Square s=(int x)->x*x;
		int ans=s.calculate(a);
		s.disp(ans);
		System.out.println(ans);
	}

}
