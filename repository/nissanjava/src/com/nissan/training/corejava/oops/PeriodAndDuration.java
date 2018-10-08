package com.nissan.training.corejava.oops;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class PeriodAndDuration {
	
	public static void checkingPeriod() {
		LocalDate date1=LocalDate.now();
		
		LocalDate date2=LocalDate.of(2014,Month.DECEMBER,12);
		//no. of days btw the dates
		long difference=ChronoUnit.DAYS.between(date1, date2);
		System.out.println("days btw the dates are"+difference);
		
		Period gap=Period.between(date2, date1);
		System.out.println("gap btw dateis a peroid of"+gap);
	}
	
	public static void checkingDuration() {
		LocalTime time1=LocalTime.now();
		
		Duration fiveHours = Duration.ofHours(5);
		LocalTime time2=time1.plus(fiveHours);
		System.out.println("after adding five hours"+time2);
		
		Duration gap=Duration.between(time2, time1);
		System.out.println("duration of time"+gap);
	}
	
	public static void main(String[] args) {
		checkingPeriod();
		checkingDuration();
	}

}
