package com.funcInterfaces_Lambdas;

public class FP06Puzzles_Functional_Lambdas {

	
//	jshell> Consumer<String> consumer = () -> {}	
//	|  Error:
//	|  incompatible types: incompatible parameter types in lambda expression
//	|  Consumer<String> consumer = () -> {};
//	|                              ^------^
	//consumer expects one parameter in and what we are saying is no parameter

	
//	jshell> Consumer<String> consumer = (str) -> {}
//	consumer ==> $Lambda$26/0x0000000800c0aa00@14514713
	
//	jshell> Consumer<String> consumer = (str) -> {System.out::println}
//	|  Error:
//	|  not a statement
//	|  Consumer<String> consumer = (str) -> {System.out::println};
//	|                                        ^-----------------^
//	|  Error:
//	|  ';' expected
//	|  Consumer<String> consumer = (str) -> {System.out::println};
//	|                                                           ^

//	jshell> Consumer<String> consumer = System.out::println
//			consumer ==> $Lambda$27/0x0000000800c0b200@5a2e4553

//	jshell> Consumer<String> consumer = (str) -> System.out.println(str)
//			consumer ==> $Lambda$28/0x0000000800c0b830@6d5380c2

	
	
//	jshell> BiConsumer<String, String> consumer = (str, str2) -> System.out.println(str)
//			consumer ==> $Lambda$29/0x0000000800c0d000@7a4f0f29
//
//	jshell> Supplier <String> supplier = () -> "sanjeev"
//	supplier ==> $Lambda$26/0x0000000800c0aa00@14514713
//
//	jshell> Supplier <String> supplier = () -> {"sanjeev"}
//	|  Error:
//	|  not a statement
//	|  Supplier <String> supplier = () -> {"sanjeev"};
//	|                                      ^-------^
//	|  Error:
//	|  ';' expected
//	|  Supplier <String> supplier = () -> {"sanjeev"};
//	|                                               ^
//
//	jshell> Supplier <String> supplier = () -> {"sanjeev";}
//	|  Error:
//	|  not a statement
//	|  Supplier <String> supplier = () -> {"sanjeev";};
//	|                                      ^-------^
//	|  Error:
//	|  incompatible types: bad return type in lambda expression
//	|      missing return value
//	|  Supplier <String> supplier = () -> {"sanjeev";};
//	|                               ^----------------^
//
//	jshell> Supplier <String> supplier = () -> {return "sanjeev";}
//	supplier ==> $Lambda$26/0x0000000800c0aa00@14514713
	
//	jshell> Consumer <String> consumer = (str) -> System.out.println(str);System.out.println(str);
//	consumer ==> $Lambda$27/0x0000000800c0b000@4459eb14
//	|  Error:
//	|  cannot find symbol
//	|    symbol:   variable str
//	|  System.out.println(str);
//	|                     ^-^
//
//	jshell> Consumer <String> consumer = (str) -> {System.out.println(str);System.out.println(str);}
//	consumer ==> $Lambda$28/0x0000000800c0b428@28c97a5
}
