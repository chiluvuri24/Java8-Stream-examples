package com.rr.streamsbits;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class SumAverageCount {
   public static void main(String[] args) {
		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));

		// allMatch, noneMatch, anyMatch

		// System.out.println( courses.stream().allMatch(c->c.getReviewScore()>90));

		// System.out.println(courses.stream().noneMatch(c->c.getReviewScore()<90));
		Predicate<? super Course> reviewScoreGreater97 = c -> c.getReviewScore() > 95;
		System.out.println(courses.stream().anyMatch(reviewScoreGreater97));

		Comparator<Course> compareByNoOfSStudentsIncreasingOrder = Comparator
				.comparingInt(Course::getStudentsRegistered);

		courses.stream().sorted(compareByNoOfSStudentsIncreasingOrder).forEach(x -> System.out.println(x));

		Comparator<Course> compareByNoOfSStudentsDecreasingOrder = Comparator
				.comparingInt(Course::getStudentsRegistered).reversed();

		Comparator<Course> compareByNoOfSStudentsDecreasingOrderAndThenReviewScore = Comparator
				.comparingInt(Course::getStudentsRegistered).reversed().thenComparingInt(Course::getReviewScore);

		
		// sum
		System.out.println(courses.stream().filter(reviewScoreGreater97).mapToInt(Course::getStudentsRegistered).sum());
		
		// average
		System.out.println(courses.stream().filter(reviewScoreGreater97).mapToInt(Course::getStudentsRegistered).average());
		
		//count
		System.out.println(courses.stream().filter(reviewScoreGreater97).mapToInt(Course::getStudentsRegistered).count());
		
   }
}
