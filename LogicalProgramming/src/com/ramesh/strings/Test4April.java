package com.ramesh.strings;

import java.util.*;
import java.util.stream.Collectors;

public class Test4April {
	
	
	public static void findDuplicatesFromArray(int[] arr) {
		
		Set<Integer> duplicateArr = new HashSet<>();

		Set<Integer> duplicatesInArr = Arrays.stream(arr)
				                             .filter(x->!duplicateArr.add(x))
				                             .boxed()
				                             .collect(Collectors.toSet());
		
		System.out.println(duplicatesInArr);
		
		
	}
	
	
	public static void sumOfAllDigitsFromNumber(int num) {
		System.out.println("start of method");
		int copyOfSumNumber = num;
		int sum = 0;
		int remianNum = num;
		
		while(remianNum != 0) {
			int lastDigit = copyOfSumNumber%10;
			remianNum = copyOfSumNumber/10;
			copyOfSumNumber = remianNum;
			sum = sum +lastDigit;
			
		}
		
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		//findDuplicatesFromArray(new int[] {2,4,3,3,7,5,9,3,9,5});
		
		//sumOfAllDigitsFromNumber(77777);
		
		
		//find2ndLargestNumberFromIntegerArray(new int[] {2,56,78,98,45,56}, 90);
		
		
		//findEachCharFromGivenString(String str);
		
		//findEachCharFromGivenString("Java J2EE Java JSP J2EE");
		
		//findPairsOfSubArrayWhoseSumEqualsToGivenNumber(new int[]{42, 15, 12, 8, 6, 32}, 26);
		
		//removingDuplicateElementsFromArrayList(Arrays.asList(2,5,6,8,4,2,4));
		
		
		System.out.println(isBinaryOrNot(11010111));
		
		
	}
	
	private static boolean isBinaryOrNot(int i) {

		boolean isBinary = true;
		
		int copyOfParam = i;
		
		while(copyOfParam != 0) {
			
			int temp = copyOfParam%10;
			
			if(temp>1) {
				isBinary =false;
				break;
			}else {
				copyOfParam = copyOfParam/10;
			}
			
		}
		
		
		return isBinary;
	}


	private static void removingDuplicateElementsFromArrayList(List<Integer> asList) {
		
		// Approach-1
		//System.out.println(asList.stream().distinct().collect(Collectors.toList()));
		
		//Approach-2
		Set<Integer> ele = new HashSet<>(asList);
		
		System.out.println(new ArrayList<>(ele));
		
		
	}


	private static void findPairsOfSubArrayWhoseSumEqualsToGivenNumber(int[] array, int n) {
		
		
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]+array[j]==n) {
					System.out.println(" Matched Sub array Elements::"+array[i]+" "+array[j]);
				}
				
				
			}
			
			
		}
		
		
	}


	private static void findEachCharFromGivenString(String str) {
		
		Map<String,Integer> countMap = new HashMap<>();
		
		
		String[] strArr = str.split("");
		
		for(String s : strArr) {
			
			if(s != null && !s.isEmpty()) {
				
				if(countMap.containsKey(s)) {
					countMap.put(s, countMap.get(s)+1);
				}else {
					countMap.put(s,1);
				}
				
				
			}
			
		}
		
		
		System.out.println(countMap);
		
		
	}


	private static void find2ndLargestNumberFromIntegerArray(int[] intArr, int element) {
		
		//Arrays.stream(intArr).sorted(Collections.reverseOrder()).skip(1).find
		
		System.out.println(Arrays.toString(intArr));
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		if(intArr.length>=element) {
			System.out.println(" Second Largest Element "+intArr[element]);
		}else {
			System.out.println(" No Element Found At array at index "+element);
		}
		
	}

}
