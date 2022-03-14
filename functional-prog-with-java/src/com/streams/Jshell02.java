package com.streams;

public class Jshell02 {//finding squares and cubes
	
//	C:\Users\ssaini>jshell
//	|  Welcome to JShell -- Version 16.0.1
//	|  For an introduction type: /help intro
//
//	jshell> List <Integer> numbers =List.of(12, 9, 13, 4, 6, 2, 4, 12, 15)
//	numbers ==> [12, 9, 13, 4, 6, 2, 4, 12, 15]
//
//	jshell> numbers
//	numbers ==> [12, 9, 13, 4, 6, 2, 4, 12, 15]
//
//	jshell> numbers.stream().reduce(0, (x,y) -> x*x + y*y)
//	$3 ==> -1935093279
//
//	jshell> numbers.stream().map(x -> x*x).reduce(0,Integer::sum)
//	$4 ==> 835
//
//	jshell> numbers.stream().map(x -> x*x*x).reduce(0,Integer::sum)
//	$5 ==> 10109
//sum of odd numbers in the list
//	jshell> numbers.stream().filter(x -> x%2 ==1).reduce(0, Integer::sum)
//	$6 ==> 37
//	sum of even numbers in the list
//	jshell> numbers.stream().filter(x -> x%2 ==0).reduce(0, Integer::sum)
//	$7 ==> 40
}
