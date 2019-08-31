package com.haripadisetti.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {

	public static void main(String[] args) {
		
		Predicate<String> predicate = (s) -> s.equals("ra");
		
		System.out.println("testing");
		
		List<String> list = new ArrayList<>();
		list.add("hari");
		list.add("raju");
		list.add("madhu");
		
		List<String> filerData= (List<String>) list.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println("filerData=" + filerData);
	}
}
