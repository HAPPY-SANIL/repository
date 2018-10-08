package com.nissan.training.corejava.collection;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Employee> emps=new ArrayList<Employee>();
		emps.add(new Employee("A", "G"));
		emps.add(new Employee("B", "k"));
		
		Employee e=emps.get(1);
		e.setLastName("new");
		
		System.out.println(e.getFirstName()+e.getLastName());
		
	}

}
