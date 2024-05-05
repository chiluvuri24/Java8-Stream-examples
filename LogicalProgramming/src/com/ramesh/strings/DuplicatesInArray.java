package com.ramesh.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesInArray {

	private static void findDuplicatesUsingJava8(int[] inputArr) {
		
		Set<Integer> duplicate = new HashSet<>();
		
		Set<Integer> duplicateEle = Arrays.stream(inputArr)
				                          .filter(x -> !duplicate.add(x))
				                          .boxed()
				                          .collect(Collectors.toSet());
		
		System.out.println(duplicateEle);
		

	}
	
	
	private static void findContinuousArrayWithMaxSum(int[] inputArr) {
		
		int bestSum = inputArr[0];
		int bestStart=0,bestEnd=0,currentStart=0,currentSum=0;
		
		
		for(int i=0;i<inputArr.length;i++) {
			
			currentSum = currentSum+inputArr[i];
			
			if(currentStart < 0) {
				currentSum=0;
				currentStart = i+1;
			}else if(currentSum > bestSum) {
				bestSum = currentSum;
				bestStart = currentStart;
				bestEnd = i;
			}
			
			
		}
		
		
		System.out.println(" Input Array :::"+Arrays.toString(inputArr));
		
		System.out.println(" Countinous array with Max Sum :::");
		
		for(int i = bestStart;i<=bestEnd;i++) {
			System.out.println(inputArr[i]);
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		//findDuplicatesUsingJava8(new int[] {-2,7,9,4,5,-2,8,9,7});
		
		findContinuousArrayWithMaxSum(new int[] {-2,7,9,-4,5,-2,8});
		
	}
	
	
}
