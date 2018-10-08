package com.nissan.training.corejava.oops;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateDemo {
	
	public static void LocalDateTimeApi() {
		LocalDate date=LocalDate.now();
		System.out.println("the current time is"+date);
		
		LocalTime time=LocalTime.now();
		System.out.println("the current time is"+time);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("the current date and time is"+current);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTime = current.format(format);
		
		System.out.println("in formatted manner"+formatedDateTime);
		
		Month month=current.getMonth();
		int day=current.getDayOfMonth();
		int seconds=current.getSecond();
		System.out.println("month :"+month+" day :"+day+" seconds:"+seconds);
		
		
		LocalDate date2=LocalDate.of(1950, 1, 26);
		System.out.println("the republic day :"+date2);
		
		LocalDateTime specificDate=current.withDayOfMonth(24).withYear(2016);
		
		System.out.println("specific date with"+"current time"+specificDate);
		
	}
public static void main(String[] args) {
	LocalDateTimeApi();
}
}
