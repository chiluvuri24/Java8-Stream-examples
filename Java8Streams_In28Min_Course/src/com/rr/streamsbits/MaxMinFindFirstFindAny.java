package com.rr.streamsbits;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MaxMinFindFirstFindAny {
	
	
	public static void main(String[] args) {
		
		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				                       new Course("Spring Boot", "Framework", 95, 18000), 
                new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), 
                new Course("AWS", "Cloud", 94, 21000),
                new Course("Azure", "Cloud", 99, 21000), 
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 99, 20000));
		Predicate<? super Course> reviewScoreGreater97 = c->c.getReviewScore()>97;
		
		Comparator<Course> compareByNoOfSStudentsDecreasingOrderAndThenReviewScore = Comparator.comparingInt(Course::getStudentsRegistered).reversed().thenComparingInt(Course::getReviewScore);
		System.out.println(courses.stream().max(compareByNoOfSStudentsDecreasingOrderAndThenReviewScore).get());
		
		System.out.println(courses.stream().min(compareByNoOfSStudentsDecreasingOrderAndThenReviewScore).get());
		
		System.out.println(courses.stream().filter(reviewScoreGreater97).findFirst().orElse(new Course("test","test",78,900)));
		
		System.out.println(courses.stream().filter(reviewScoreGreater97).findAny().orElse(new Course("test","test",78,900)));
		
	}

}
