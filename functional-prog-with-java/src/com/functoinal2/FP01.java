package com.functoinal2;

public class FP01 {//creating streams using Stream of method() and for Arrays

//	jshell> List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
//	numbers ==> [12, 9, 13, 4, 6, 2, 4, 12, 15]
	
//	jshell> numbers.stream()
//	$7 ==> java.util.stream.ReferencePipeline$Head@2077d4de//The ReferencePipelines is when we are using wrapper classes or custom classes and in pipeline
	
//	
//	jshell> Stream.of(12,9,13,4,6,2,4,12,15).count()
//	$4 ==> 9		
//	
//	jshell> Stream.of(12,9,13,4,6,2,4,12,15).reduce(0,Integer::sum)
//	$5 ==> 77
//	
//	jshell> Stream.of(12,9,13,4,6,2,4,12,15)
//	$8 ==> java.util.stream.ReferencePipeline$Head@77a567e1//The ReferencePipelines is when we are using wrapper classes or custom classes and in pipeline
	
//	jshell> int [] numberArray ={12,9,13,4,6,2,4,12,15};
//	numberArray ==> int[9] { 12, 9, 13, 4, 6, 2, 4, 12, 15 }

//	jshell> Arrays.stream(numberArray)
//	$11 ==> java.util.stream.IntPipeline$Head@4bf558aa//we are having primitive integer values and the type is IntPipeline

//	jshell> Arrays.stream(numberArray).sum()
//	$12 ==> 77
//
//	jshell> Arrays.stream(numberArray).average()
//	$13 ==> OptionalDouble[8.555555555555555]
//
//	jshell> Arrays.stream(numberArray).min()
//	$14 ==> OptionalInt[2]
//
//	jshell> Arrays.stream(numberArray).max()
//	$15 ==> OptionalInt[15]
}
