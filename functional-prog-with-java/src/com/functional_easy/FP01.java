package com.functional_easy;

public class FP01 {

//	jshell> List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
//	 "Kubernetes" );
//	courses ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]
//
//	jshell> courses.replaceAll( str -> str.toUpperCase())
//	|  Exception java.lang.UnsupportedOperationException
//	|        at ImmutableCollections.uoe (ImmutableCollections.java:142)
//	|        at ImmutableCollections$AbstractImmutableList.replaceAll (ImmutableCollections.java:259)
//	|        at (#2:1)
//
//	jshell> List<String> modifyableCourses = new ArrayList(courses)
//	|  Warning:
//	|  unchecked call to ArrayList(java.util.Collection<? extends E>) as a member of the raw type java.util.ArrayList
//	|  List<String> modifyableCourses = new ArrayList(courses);
//	|                                   ^--------------------^
//	|  Warning:
//	|  unchecked conversion
//	|    required: java.util.List<java.lang.String>
//	|    found:    java.util.ArrayList
//	|  List<String> modifyableCourses = new ArrayList(courses);
//	|                                   ^--------------------^
//	modifyableCourses ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]
//
//	jshell> modifyableCourses.replaceAll(str -> str.toUpperCase())
//
//	jshell> modifyableCourses
//	modifyableCourses ==> [SPRING, SPRING BOOT, API, MICROSERVICES, AWS, PCF, AZURE, DOCKER, KUBERNETES]
//
//	jshell> modifyableCourses.removeIf(course -> course.length()<6)
//	$6 ==> true
//
//	jshell> modifyableCourses
//	modifyableCourses ==> [SPRING, SPRING BOOT, MICROSERVICES, DOCKER, KUBERNETES]
	
}
