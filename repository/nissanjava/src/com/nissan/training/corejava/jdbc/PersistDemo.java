package com.nissan.training.corejava.jdbc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersistDemo {
	public static void main(String[] args) throws IOException {
		Student s1=new Student(211, "ravi");
		Student s2=new Student(212, "rvi");
		FileOutputStream fout=new FileOutputStream("f.txt");
		@SuppressWarnings("resource")
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.writeObject(s2);
		out.flush();
		System.out.println("sucess");
	}

}
