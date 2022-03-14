package com.streams;

public class Jshell01 {
//	C:\Users\ssaini>jshell
//	|  Welcome to JShell -- Version 16.0.1
//	|  For an introduction type: /help intro
//
//	jshell> System.out.println("sanjeev");
//	sanjeev
//
//	jshell> List.of(12, 9, 13, 4, 6, 2, 4, 12, 15)
//	$2 ==> [12, 9, 13, 4, 6, 2, 4, 12, 15]
//
//	jshell> List <Integer> numbers =List.of(12, 9, 13, 4, 6, 2, 4, 12, 15)
//	numbers ==> [12, 9, 13, 4, 6, 2, 4, 12, 15]
//
//	jshell> numbers.stream().reduce(0,(x,y)->x+y)
//	$4 ==> 77
//
//	jshell> numbers.stream().reduce(0,(x,y)->x)
//	$5 ==> 0
//
//	jshell> numbers.stream().reduce(0,(x,y)->y)
//	$6 ==> 15
//
//	jshell> numbers.stream().reduce(0,(x,y)->x>y?x:y)
//	$7 ==> 15
//
//	jshell> numbers.stream().reduce(0,(x,y)->x>y?y:x)
//	$8 ==> 0
//
//	jshell> numbers.stream().reduce(Integer.MIN_VALUE,(x,y)->x>y?x:y)
//	$9 ==> 15
//
//	jshell> numbers.stream().reduce(Integer.MIN_VALUE,(x,y)->x>y?y:x)
//	$10 ==> -2147483648
//
//	jshell> numbers.stream().reduce(Integer.MAX_VALUE,(x,y)->x>y?y:x)
//	$11 ==> 2
//
//	jshell> numbers
//	numbers ==> [12, 9, 13, 4, 6, 2, 4, 12, 15]
}
