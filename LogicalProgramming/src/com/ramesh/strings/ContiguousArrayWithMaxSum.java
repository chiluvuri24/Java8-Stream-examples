package com.ramesh.strings;

import java.util.Arrays;

public class ContiguousArrayWithMaxSum {	
	
	
	public static void getSubArrayWithMaxSum(int[] inputArray) {
		
		int bestSum = inputArray[0];
		int bestStart = 0;
		int bestEnd =0;
		
		int currentStart=0,currentSum=0;
		
		for(int i=0;i<inputArray.length;i++) {
			
			currentSum = currentSum + inputArray[i];
			
			
			if(currentSum<0) {
				currentSum=0;
				currentStart=i+1;
			}else if (currentSum > bestSum) {
				
				bestSum = currentSum;
				bestStart = currentStart;
				bestEnd = i;
				
				
			}
			
			
		}
		
		System.out.println(" Input Array ::"+Arrays.toString(inputArray));
		
		System.out.println(" Continous Sub Array With Max Sum ");
		
		for(int i=bestStart; i<= bestEnd;i++) {
			System.out.println(inputArray[i]);
		}
		
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		 getSubArrayWithMaxSum(new int[] {2, -3, 7, -4, 2, 5, -8, 6, -1});
		
		
	}
}
