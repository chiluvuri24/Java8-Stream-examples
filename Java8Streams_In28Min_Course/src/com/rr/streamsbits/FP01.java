package com.rr.streamsbits;

import java.util.List;

public class FP01 {
	
	
	public static void main(String[] args) {
		
		printAllNumnberesStructured(List.of(2,6,78,12,45,12,13,45));
		
		printAllNumnberesUsingJava8(List.of(2,6,78,12,45,12,13,45));
		
		
	}

	private static void printAllNumnberesUsingJava8(List<Integer> of) {
		
		of.stream().forEach(System.out::println);
		
	}

	private static void printAllNumnberesStructured(List<Integer> list) {
		
		for(Integer n :list) {
			System.out.println(n);
		}
		
	}

}
