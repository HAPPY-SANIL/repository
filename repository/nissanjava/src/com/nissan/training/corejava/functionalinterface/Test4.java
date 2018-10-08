package com.nissan.training.corejava.functionalinterface;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.*;

public class Test4 {
	
	public static void main(String[] args) {
		//create a list of strings
		
		List <String> names=
				Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");
		
		Predicate<String> p=(s)->s.startsWith("G");
		
		for(String st:names)
		{
			if(p.test(st))
			{
				System.out.println(st);
			}
		}

	}

}
