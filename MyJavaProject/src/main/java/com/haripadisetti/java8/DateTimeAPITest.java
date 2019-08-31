package com.haripadisetti.java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class DateTimeAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime dateTime = LocalDateTime.now(); //LocalDateTime
		Instant instant = Instant.now(); //Instant
		System.out.println("Date Time=" + dateTime);
		System.out.println("Year=" + dateTime.getYear());
		System.out.println("instant=" + instant);
		System.out.println("instant=" + instant.getEpochSecond());
		
		Instant start = Instant.parse("2018-10-13T11:15:35.00Z");
		Instant end = Instant.parse("2018-10-13T11:16:35.00Z");
		         
		Duration duration = Duration.between(start, end); //Duration
		System.out.println("Duration in seconds: "+duration.getSeconds());

	}

}
