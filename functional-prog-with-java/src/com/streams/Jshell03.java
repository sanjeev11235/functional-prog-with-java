package com.streams;

public class Jshell03 {

//	jshell> numbers.stream().distinct().forEach(System.out::println)
//	12
//	9
//	13
//	4
//	6
//	2
//	15
//
//	jshell> numbers.stream().sorted().forEach(System.out::println)
//	2
//	4
//	4
//	6
//	9
//	12
//	12
//	13
//	15
//
//	jshell> numbers.stream().distinct().sorted().forEach(System.out::println)
//	2
//	4
//	6
//	9
//	12
//	13
//	15
	
//	jshell> List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices","AWS", "PCF", "Azure", "Docker", "Kubernetes" );
//			courses ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]
//
//			jshell> courses.stream().sorted().forEach(System.out::println)
//			API
//			AWS
//			Azure
//			Docker
//			Kubernetes
//			Microservices
//			PCF
//			Spring
//			Spring Boot
//	jshell> courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println)
//	API
//	AWS
//	Azure
//	Docker
//	Kubernetes
//	Microservices
//	PCF
//	Spring
//	Spring Boot
//
//	jshell> courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println)
//	Spring Boot
//	Spring
//	PCF
//	Microservices
//	Kubernetes
//	Docker
//	Azure
//	AWS
//	API
//
//	jshell> courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println)
//	API
//	AWS
//	PCF
//	Azure
//	Spring
//	Docker
//	Kubernetes
//	Spring Boot
//	Microservices
}
