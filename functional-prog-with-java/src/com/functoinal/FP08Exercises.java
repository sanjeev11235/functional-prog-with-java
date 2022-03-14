package com.functoinal;

import java.util.List;

public class FP08Exercises {//printing all string in the array 

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
										"AWS", "PCF", "Azure", "Docker", "Kubernetes" );
		
		courses.stream()
			.forEach(System.out::println);
	}
}
