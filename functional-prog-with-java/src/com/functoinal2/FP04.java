package com.functoinal2;

public class FP04 {

//	jshell> List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
//			 "Kubernetes" );
//			courses ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]
	// I would want to actually combine all of them, separated by a comma.
//	jshell> courses.stream().collect(Collectors.joining(" "))
//	$5 ==> "Spring Spring Boot API Microservices AWS PCF Azure Docker Kubernetes"
//
//	jshell> courses.stream().collect(Collectors.joining(" , "))
//	$6 ==> "Spring , Spring Boot , API , Microservices , AWS , PCF , Azure , Docker , Kubernetes"
	
	 //I'd want to take this list of strings and I would want to look at all the characters which are present in each one of these strings.

//	jshell> "Spring".split("")
//	$7 ==> String[6] { "S", "p", "r", "i", "n", "g" }
//
//	jshell> courses.stream().map(course -> course.split("")).collect(Collectors.toList())
//	$8 ==> [[Ljava.lang.String;@3fa77460, [Ljava.lang.String;@619a5dff, [Ljava.lang.String;@1ed6993a, 
		//[Ljava.lang.String;@7e32c033, [Ljava.lang.String;@7ab2bfe1, [Ljava.lang.String;@497470ed, 
		//[Ljava.lang.String;@63c12fb0, [Ljava.lang.String;@b1a58a3, [Ljava.lang.String;@6438a396]
	//The reason why it was did not work as expected is because when we do a split, what we get back is a String
	//array and the result of this operation, the entire map operation, is actually a stream of string arrays.

//	jshell> courses.stream().map(course -> course.split(""))
//	$9 ==> java.util.stream.ReferencePipeline$3@3d71d552
//
//	jshell> courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList())
//	$10 ==> [S, p, r, i, n, g, S, p, r, i, n, g,  , B, o, o, t, A, P, I, M, i, c, r, o, s, e, r, v, i, c, e, s, A, W, S, P, C, F, A, z, u, r, e, D, o, c, k, e, r, K, u, b, e, r, n, e, t, e, s]
	//flatMap: each element of Stream replaced with content of mapped stream Mapping Function -> Arrays::stream
//	jshell> courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList())
//	$11 ==> [S, p, r, i, n, g,  , B, o, t, A, P, I, M, c, s, e, v, W, C, F, z, u, D, k, K, b]
	//distinct
	
//	jshell>   List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
//			 "Kubernetes";)
//			courses ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]
//
//	jshell> List<String> courses2 = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
//			" ubernetes" );
//			courses2 ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]	
//	jshell> courses.stream().flatMap(courses -> courses2.stream().map(courses2 -> List.of(courses, courses2))).collect(Collectors.toList())
//	$14 ==> [[Spring, Spring], [Spring, Spring Boot], [Spring, API], [Spring, Microservices], [Spring, AWS], [Spring, PCF],
//	         [Spring, Azure], [Spring, Docker], [Spring, Kubernetes], [Spring Boot, Spring], [Spring Boot, Spring Boot],
//	         [Spring Boot, API], [Spring Boot, Microservices], [Spring Boot, AWS], [Spring Boot, PCF], [Spring Boot, Azure],
//	         [Spring Boot, Docker], [Spring Boot, Kubernetes], [API, Spring], [API, Spring Boot], [API, API], [API, Microservices],
//	         [API, AWS], [API, PCF], [API, Azure], [API, Docker], [API, Kubernetes], [Microservices, Spring],
//	         [Microservices, Spring Boot], [Microservices, API], [Microservices, Microservices], [Microservices, AWS],
//	         [Microse ... ], [Docker, API], [Docker, Microservices], [Docker, AWS], [Docker, PCF], [Docker, Azure],
//	         [Docker, Docker], [Docker, Kubernetes], [Kubernetes, Spring], [Kubernetes, Spring Boot], [Kubernetes, API],
//	         [Kubernetes, Microservices], [Kubernetes, AWS], [Kubernetes, PCF], [Kubernetes, Azure], [Kubernetes, Docker], 
//	         [Kubernetes, Kubernetes]]
	//we'd want to identify pairs of these courses which have the same number of characters present in them.
	//all the strings which have the same length, I would want to create tuples around them.
//	jshell> courses.stream().flatMap(courses -> courses2.stream().map(courses2 -> List.of(courses, courses2))).filter(list -> list.get(0).equals(list.get(1))).collect(Colle
//			ctors.toList())
//	$15 ==> [[Spring, Spring], [Spring Boot, Spring Boot], [API, API], [Microservices, Microservices], [AWS, AWS], [PCF, PCF], [Azure, Azure], [Docker, Docker], [Kubernetes, Kubernetes]]	
//	jshell> courses.stream().flatMap(courses -> courses2.stream().map(courses2 -> List.of(courses, courses2))).filter(list ->! list.get(0).equals(list.get(1))).collect(Coll
//			e tors.toList())
//	$16 ==> [[Spring, Spring Boot], [Spring, API], [Spring, Microservices], [Spring, AWS], [Spring, PCF], [Spring, Azure], 
//    [Spring, Docker], [Spring, Kubernetes], [Spring Boot, Spring], [Spring Boot, API], [Spring Boot, Microservices], 
//    [Spring Boot, AWS], [Spring Boot, PCF], [Spring Boot, Azure], [Spring Boot, Docker], [Spring Boot, Kubernetes], 
//    [API, Spring], [API, Spring Boot], [API, Microservices], [API, AWS], [API, PCF], [API, Azure], [API, Docker],
//    [API, Kubernetes], [Microservices, Spring], [Microservices, Spring Boot], [Microservices, API], [Microservices, AWS],
//    [Microservices, PCF], [Microservices, Azure], [Microservices, Docker], [Microservices, Kubernetes] ... tes], [Docker, Spring],
//	[Docker, Spring Boot], [Docker, API], [Docker, Microservices], [Docker, AWS], [Docker, PCF], [Docker, Azure], [Docker, Kubernetes],
//	[Kubernetes, Spring], [Kubernetes, Spring Boot], [Kubernetes, API], [Kubernetes, Microservices], [Kubernetes, AWS], [Kubernetes, PCF], 
//	[Kubernetes, Azure], [Kubernetes, Docker]]
	
//	jshell> courses.stream().flatMap(courses -> courses2.stream().filter(courses2 ->courses2.length() == courses.length()).map(courses2 -> List.of(courses, courses2))).filter(list ->! list.get(0).equals(list.get(1))).col
//	 ect(Collectors.toList())
//	$17 ==> [[Spring, Docker], [API, AWS], [API, PCF], [AWS, API], [AWS, PCF], [PCF, API], [PCF, AWS], [Docker, Spring]]	
	//we want to look at is also to filter based on the length. 
	
	/**
	 * A flatMap helps us in flattening a stream of values. So, if you have a stream of string arrays, you can flatten it to a stream of string.
	 */

}
