package com.nissan.training.corejava.oops;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalDemo {
	
	public static void checkingAdjusters() {
		LocalDate date=LocalDate.now();
		
		System.out.println("the current date is "+date);
		//to get first day of next month
		LocalDate dayOfNextMonth=date.with(TemporalAdjusters.firstDayOfNextMonth());
		
		System.out.println("firstDayOfNextMonth:"+dayOfNextMonth);
		//get the next saturday
		LocalDate nextSaturday= date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		
		System.out.println("next saturday from now is "+nextSaturday);
		
		//first day of current month
		LocalDate firstDayOfMonth=date.with(TemporalAdjusters.firstDayOfMonth());
		
		System.out.println("first day of current month is +"+firstDayOfMonth);
		
		//last day of current month
		
		LocalDate lastDayOfMonth=date.with(TemporalAdjusters.lastDayOfMonth());
		
		System.out.println("last day of current month is +"+lastDayOfMonth);
		
	}
	
	public static void main(String[] args) {
		checkingAdjusters();
	}

}
