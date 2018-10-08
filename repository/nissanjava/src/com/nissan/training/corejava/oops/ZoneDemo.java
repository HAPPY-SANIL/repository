package com.nissan.training.corejava.oops;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDemo {
	
	public static void ZonedTimeAndDate()
	{
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		
		String formattedCurrentDate = date.format(format1);
		
		System.out.println("formatted current date "+formattedCurrentDate);
		
		ZonedDateTime currentZone=ZonedDateTime.now();
		System.out.println("current zone is"+currentZone.getZone());
		
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");
		
		ZonedDateTime tokyoZone=currentZone.withZoneSameInstant(tokyo);
		
		System.out.println("tokyo time zone is "+tokyoZone);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		String formattedDateTime =tokyoZone.format(format);
		System.out.println("formatted tokyo time zone"+formattedDateTime);
		
		
	
	}
	public static void main(String[] args) {
		ZonedTimeAndDate();
	}
}
