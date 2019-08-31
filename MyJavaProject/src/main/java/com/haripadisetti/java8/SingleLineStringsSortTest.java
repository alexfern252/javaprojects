package com.haripadisetti.java8;

import java.util.Arrays;
import java.util.List;

public class SingleLineStringsSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List
		List<String> list = Arrays.asList("raju","madhu","syam","bhushanam");
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("=============================================");
		
		//Single line statement for sorting
		Arrays.asList("raju","madhu","syam","bhushanam","abc").stream().sorted().forEach(System.out::println);

	}

}
