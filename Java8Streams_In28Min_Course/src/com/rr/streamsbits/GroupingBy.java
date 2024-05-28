package com.rr.streamsbits;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingBy {
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
    	 
    	 
			System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory)));
			//{Cloud=[AWS Cloud 92 21000, Azure Cloud 99 21000, Docker Cloud 92 20000, Kubernetes Cloud 91 20000], FullStack=[FullStack FullStack 91 14000], Microservices=[API Microservices 97 22000, Microservices Microservices 96 25000], Framework=[Spring Framework 98 20000, Spring Boot Framework 95 18000]}
			
			
			System.out.println(
					courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
            //{Cloud=4, FullStack=1, Microservices=2, Framework=2}
			
			System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,
					Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
    	    //{Cloud=Optional[Azure Cloud 99 21000], FullStack=Optional[FullStack FullStack 91 14000], Microservices=Optional[API Microservices 97 22000], Framework=Optional[Spring Framework 98 20000]}
			
    	    System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,
    	   		                                                          Collectors.mapping(Course::getName, Collectors.toList()))));
    	 //{Cloud=[AWS, Azure, Docker, Kubernetes], FullStack=[FullStack], Microservices=[API, Microservices], Framework=[Spring, Spring Boot]}

    	 
	}
}
