package com.ramesh.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicatesAndCountFromString {
	
	public static void main(String[] args) {
		
		System.out.println(findDuplicateCharAndCount("Better Butter"));
		
	}

	
	public static Map<String, Integer> findDuplicateCharAndCount(String str){
		
		String[] value = str.split("");
		
		Map<String,Integer> countMap = new HashMap<>();
		
		for(String val:value) {
			
			if(val.equals(" ")) {
				continue;
			}			
			if(countMap.containsKey(val)) {
				int countVal = countMap.get(val)+1;
				countMap.put(val, countVal);
			}else {
				countMap.put(val, 1);
			}
			
		}
		
		for(Map.Entry<String, Integer> entry : countMap.entrySet()) {
			if(entry.getValue()==1) {
				countMap.remove(entry.getKey());
			}
		}
		
		return countMap;
		
	} 
	
}
