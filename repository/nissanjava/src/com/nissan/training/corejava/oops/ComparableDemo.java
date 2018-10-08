package com.nissan.training.corejava.oops;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(new Movie(8.3,"Force Awakens",2015));
		list.add(new Movie(8.0,"Star Wars",2011));
		list.add(new Movie(9.0,"Swashangs redemtion",2010));
		list.add(new Movie(8.2,"mendelist",2013));
		
		Collections.sort(list);
		
		System.out.println("movies after sorting:");
		for(Movie movie:list) {
			System.out.println(movie.getName());
			System.out.println(movie.getRating());
			System.out.println(movie.getYear());
		}
	}

}
