package com.ramesh.strings;

import java.util.Arrays;

public class AnagramTest {
	
	static void isAnagram(String s1, String s2) {
	
		String copyOfs1 = s1.replaceAll(" ", "");
		String copyOfs2 = s2.replaceAll(" ", "");
		
		boolean isAnagram = false;
		
		if(copyOfs1.length() == copyOfs2.length()) {
			
			char[] s1Char = copyOfs1.toLowerCase().toCharArray();
			char[] s2Char = copyOfs2.toLowerCase().toCharArray();
			
			
			Arrays.sort(s1Char);
			Arrays.sort(s2Char);
			
			isAnagram = Arrays.equals(s1Char, s2Char);
		}
		System.out.println(" The words "+s1+", "+s2 +" anagram status is "+isAnagram);
		
	}
	
	public static void main(String[] args) {
		isAnagram("Mother In Law", "Hitler Woman");
		isAnagram("joy", "enjoy");
	}
	
}
