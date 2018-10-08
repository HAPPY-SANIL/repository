package com.nissan.training.corejava.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream fin=new ObjectInputStream(new FileInputStream("f.txt"));
		Student s=(Student)fin.readObject();
		Student s1=(Student)fin.readObject();
		System.out.println(s.id+" "+s.name);
		System.out.println(s1.id+" "+s1.name);
		fin.close();
		
	}

}

