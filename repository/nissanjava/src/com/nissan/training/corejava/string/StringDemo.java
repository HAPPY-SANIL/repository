package com.nissan.training.corejava.string;
class AAA{
	void show() {
		System.out.println("hi");
	}
}

class BBB extends AAA{
	@Override
	void show()
	{
		System.out.println("hello");
	}
	@Deprecated
	void sh()
	{
		System.out.println("i am deprecated");
	}
	
}
public class StringDemo {
public static void main(String[] args) {
	String ss="abdul";
	ss.concat("Kalam");
	System.out.println(ss);
	ss=ss.concat("Kalam");
	System.out.println(ss);
	
	String s="abc";
	String s1="abc";
	String s2=new String("abc");
	String s3=new String("abc");
	
	System.out.println(s==s2);
	BBB ad=new BBB();
	ad.sh();
}
}
