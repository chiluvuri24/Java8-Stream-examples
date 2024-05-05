package com.ramesh.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {
	
	
	public static void main(String[] args) {
	
		//squareOfAllNumbers(Arrays.asList(3,4,5,6,7,8,9,10));
		
		//averageOfAllNumbers(Arrays.asList(3,4,5,6,7,8,9,10));
		
		
		/*
		 * List<Integer> list = Arrays.asList(1,10,20,30,15);
		 * 
		 * System.out.println(
		 * list.stream().map(n->n*n).filter(n->n>100).mapToInt(e->e).average().
		 * getAsDouble());
		 */
		
		// print even numbers from the list
		
		/*
		 * List<Integer> list = Arrays.asList(1,11,20,31,15,40);
		 * 
		 * System.out.println(" Even Numbers from List are");
		 * 
		 * list.stream().filter(x->x%2==0).forEach(System.out::println);
		 * 
		 * System.out.println(" Odd Numbers from List are");
		 * 
		 * list.stream().filter(x->x%2!=0).forEach(System.out::println);
		 */
		
		// print numbers starts with prefix 2
		
		List<Integer> list = Arrays.asList(17,9,23,31,25,40,3,31,78,5,39);
		
		//list.stream().filter(x->x.toString().startsWith("2")).forEach(System.out::println);
		
		
		 //System.out.println(list.stream().filter(x->Collections.frequency(list, x)>1).collect(Collectors.toSet()));
		
		// Max and Min Using streams
		System.out.println(list.stream().sorted().min((a,b)->a.compareTo(b)).get());
		
		System.out.println(list.stream().sorted().max((a,b)->a.compareTo(b)).get());
		
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		
		System.out.println(list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		
		//limit and skip methods
		
		 System.out.println(list.stream().limit(5).toList());
		
		 System.out.println(list.stream().skip(5).toList());
		 
		 // Get second Highest, Lowest From stream
		 
		 System.out.println(list);
		 
         System.out.println(list.stream().sorted().skip(1).findFirst().get()); 		 
         System.out.println(list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get());
		
	}

	private static void averageOfAllNumbers(List<Integer> asList) {
		
		System.out.println(asList.stream().mapToInt(e->e).average());
		
	}

	private static void squareOfAllNumbers(List<Integer> asList) {
		
		System.out.println(" List :::"+asList);
		
		System.out.println(" Square of List ::::"+asList.stream().map(n->n*n).collect(Collectors.toList()));
		
	}
	
	
	

}
