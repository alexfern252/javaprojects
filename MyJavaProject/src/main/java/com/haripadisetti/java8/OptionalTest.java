package com.haripadisetti.java8;

import java.util.Optional;

public class OptionalTest {
	
	Optional<String> getData(boolean flag) {
		
		if(flag) {
			return Optional.of("This is Optional class to avoid nullpointer exceptions ");
		}else {
			return Optional.empty();
		}
		
	}
	
	public static void main(String[] args) {
		OptionalTest test = new OptionalTest();
		Optional<String> str;
	
		str = test.getData(true);
		if(str.isPresent()) {
			System.out.println("Data Found and Data is =" + str.get());
		}else {
		System.out.println("No Data Found");
		}
	}

}
