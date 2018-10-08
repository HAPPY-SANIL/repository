package com.nissan.training.corejava.jdbc;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient int id;
	 String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
