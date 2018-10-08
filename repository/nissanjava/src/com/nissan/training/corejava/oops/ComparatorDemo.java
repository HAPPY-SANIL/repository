package com.nissan.training.corejava.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class RatingCompare implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		if(m1.getRating()<m2.getRating())return -1;
		if(m1.getRating()>m2.getRating())return 1;
		else return 0;
	}
	
}

class NameCompare implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		
		return m1.getName().compareTo(m2.getName());
		
	}
	
}

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(new Movie(8.3,"Force Awakens",2015));
		list.add(new Movie(8.0,"Star Wars",2011));
		list.add(new Movie(9.0,"Swashangs redemtion",2010));
		list.add(new Movie(8.2,"Mendelist",2013));
		
		System.out.println("sorted by rating");
		
		RatingCompare ratingcompare =new RatingCompare();
		Collections.sort(list, ratingcompare);
		
		for(Movie movie:list) {
			System.out.println(movie.getName());
			System.out.println(movie.getRating());
			System.out.println(movie.getYear());
		}
		
		System.out.println("sorted by name");
		
		NameCompare namecompare =new NameCompare();
		Collections.sort(list, namecompare);
		
		for(Movie movie:list) {
			System.out.println(movie.getName());
			System.out.println(movie.getRating());
			System.out.println(movie.getYear());
		}
	
	
	}

}
