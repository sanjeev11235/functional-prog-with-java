package com.functoinal2;

public class FP06 {

	
	//I would want to get all the courses whose length is greater than a specific number and then I would want to uppercase them 
	//and then I would want to find the first among them.
	
//	jshell> List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
//			 "Kubernetes" );
//			courses ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]
//	
//	jshell> courses.stream().filter(courses -> courses.length()>11).map(String::toUpperCase).findFirst()
//	$2 ==> Optional[MICROSERVICES]
	
//	jshell> courses.stream().peek(System.out::println).filter(courses -> courses.length()>11).map(String::toUpperCase).peek(
//			System.out::println).findFirst()
//			Spring
//			Spring Boot
//			API
//			Microservices
//			MICROSERVICES
//			$3 ==> Optional[MICROSERVICES]	
	
//	jshell> courses.stream().peek(System.out::println).filter(courses -> courses.length()>11).map(String::toUpperCase).peek(System.out::println)
//	$4 ==> java.util.stream.ReferencePipeline$15@6d21714c
//
//	jshell> $4.findFirst()// here we'are doing terminal operation
//	Spring
//	Spring Boot
//	API
//	Microservices
//	MICROSERVICES
//	$5 ==> Optional[MICROSERVICES]
	
	
	
	
	
	
	
	
}
