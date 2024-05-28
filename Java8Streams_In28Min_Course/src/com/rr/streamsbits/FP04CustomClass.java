package com.rr.streamsbits;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
	
	private String name;
	private String category;
	private int reviewScore;
	private int studentsRegistered;
	
	
	
	
	public Course(String name, String category, int reviewScore, int studentsRegistered) {
		
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.studentsRegistered = studentsRegistered;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getStudentsRegistered() {
		return studentsRegistered;
	}
	public void setStudentsRegistered(int studentsRegistered) {
		this.studentsRegistered = studentsRegistered;
	}
	@Override
	public String toString() {
		return name +" "+ category +" "+ reviewScore + " "+ studentsRegistered ;
	}
	
	
	
	
}



public class FP04CustomClass {
	
	
	public static void main(String[] args) {
		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), 
				new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), 
				new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), 
				new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));
		
		// allMatch, noneMatch, anyMatch
		
		//System.out.println( courses.stream().allMatch(c->c.getReviewScore()>90));	
		
		//System.out.println(courses.stream().noneMatch(c->c.getReviewScore()<90));
		Predicate<? super Course> reviewScoreGreater97 = c->c.getReviewScore()>97;
		System.out.println(courses.stream().anyMatch(reviewScoreGreater97));
		
		Comparator<Course> compareByNoOfSStudentsIncreasingOrder = Comparator.comparingInt(Course::getStudentsRegistered);
		
		courses.stream().sorted(compareByNoOfSStudentsIncreasingOrder).forEach(x->System.out.println(x));
		
		Comparator<Course> compareByNoOfSStudentsDecreasingOrder = Comparator.comparingInt(Course::getStudentsRegistered).reversed();
		
		Comparator<Course> compareByNoOfSStudentsDecreasingOrderAndThenReviewScore = Comparator.comparingInt(Course::getStudentsRegistered).reversed().thenComparingInt(Course::getReviewScore);
		

		System.out.println(courses.stream().sorted(compareByNoOfSStudentsDecreasingOrder).collect(Collectors.toList()));
		
		System.out.println(courses.stream().sorted(compareByNoOfSStudentsDecreasingOrderAndThenReviewScore).collect(Collectors.toList()));
		
		
		// takewhile
				System.out.println(" Drop While");
				System.out.println(courses.stream().dropWhile(c->c.getReviewScore()>=97).collect(Collectors.toList()));
		
		
	}
	

}
