package com.functoinal;

import java.util.List;

public class FP09Exercises {//printing string that contains "Spring" word in the array 

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
										"AWS", "PCF", "Azure", "Docker", "Kubernetes" );
		
		courses.stream()
		.filter(course -> course.contains("Spring"))
			.forEach(System.out::println);
	}
}
