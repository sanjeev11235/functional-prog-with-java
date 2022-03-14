package com.functoinal;

import java.util.List;

public class FP10Exercises {//printing string that have 4 or more letter in the array 

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
										"AWS", "PCF", "Azure", "Docker", "Kubernetes" );
		
		courses.stream()
		.filter(course -> course.length() >= 4)
			.forEach(System.out::println);
	}
}
