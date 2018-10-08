package com.nissan.training.corejava.collection;

public class EnumExample {
	
	public enum Season{WINTER,SPRING,SUMMER,FALL}
	public static void main(String[] args) {
		for(Season s : Season.values())
			System.out.println(s);
		Season season=Season.WINTER;
		switch(season) {
		case WINTER:
			System.out.println("winter");
			break;
		case SPRING:
			System.out.println("spring");
			break;
		default:
			break;
		}
	}

}
