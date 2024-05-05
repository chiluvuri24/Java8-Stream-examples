package com.ramesh.strings;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumber {
	
	
	public static boolean isPrime(int number) {
		
		boolean isPrime = true;
		
		if(number <= 1) {
			isPrime = false;
		}else {
			
	      for(int i=2; i <= number/2; i++) {
	    	  if(number%i==0) {
	    		  isPrime = false;
	    		  break;
	    	  }
	      }
		}
		return isPrime;	
	}
	
	
	public static void main(String[] args) {
		
		// Code to check given number is prime or not
		
		/*
		 * Scanner sc = new Scanner(System.in); int number = sc.nextInt();
		 * 
		 * boolean isPrime = isPrime(number);
		 * 
		 * if(isPrime) { System.out.println(number+" is a prime number"); }else
		 * System.out.println(number+" is not a prime number");
		 */
		
		
		// Code to get first n prime numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" How many prime numbers you want?");
		
		int number = sc.nextInt();
		
		int counter = 1;
		int inputNumber = 2;
		
		while(number >= counter) {
			
			if(isPrime(counter)) {
				
			}else {
				
			}
		}
		
		
	}
	
	

}
