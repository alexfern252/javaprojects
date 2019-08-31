package com.haripadisetti.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MethodReferenceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,12,568,343,112);
		Optional<Integer> max=list.stream().reduce(Math::max); //Static method reference
		max.ifPresent(System.out::println); //instance type method reference
		
		
		List<String> strList = Arrays.asList("dfa","bbc","xyz","abcd");
		System.out.println("============================sorted with lamda =============================");
		List<String> sorted= strList.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		sorted.forEach(System.out::println);
		
		
		//using method reference
		System.out.println("============================sorted with method reference =============================");
		List<String> sortedAlt = strList.stream().sorted(String::compareTo).collect(Collectors.toList());
		sortedAlt.forEach(System.out::println);
		
		
		System.out.println("=====filtering strings =====");
		strList.stream().filter(s -> s.startsWith("ab")).forEach(System.out::println);
		
		System.out.println("=====filtering strings with predicate =====");
		Predicate<String> predicate = (s) -> s.startsWith("df");
		strList.stream().filter(predicate).forEach(System.out::println);
	} 

}
