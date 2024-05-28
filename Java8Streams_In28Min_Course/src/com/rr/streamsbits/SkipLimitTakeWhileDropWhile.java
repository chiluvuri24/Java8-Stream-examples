package com.rr.streamsbits;

import java.util.List;
import java.util.stream.Collectors;
/*
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
*/

public class SkipLimitTakeWhileDropWhile {

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
		
		
		System.out.println(courses);
		
		// limit
		
		System.out.println(courses.stream().limit(3).collect(Collectors.toList()));
		
		// skip
		
		System.out.println(courses.stream().skip(3).collect(Collectors.toList()));
		
		
		// takewhile
		System.out.println(" Drop While");
		System.out.println(courses.stream().dropWhile(c->c.getReviewScore()<=91).collect(Collectors.toList()));
		
		
		
		
	}
	
}
