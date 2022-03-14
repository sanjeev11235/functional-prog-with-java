package com.functoinal;

import java.util.List;

public class FP13Exercises2 {//printing string that have 4 or more letter in the array 

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
										"AWS", "PCF", "Azure", "Docker", "Kubernetes" );
		
		courses.stream()
			.map(course -> course.length())//method 1
//			.map(course ->course + " "+ course.length())//method 2
			.forEach(System.out::println);
	}
}
