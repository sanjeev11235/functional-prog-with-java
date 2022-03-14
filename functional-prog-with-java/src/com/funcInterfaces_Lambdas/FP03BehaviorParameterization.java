package com.funcInterfaces_Lambdas;

import java.util.List;
import java.util.function.Predicate;

public class FP03BehaviorParameterization {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		/*
		 * duplication in code between these two methods, we're doing exactly the same
		 * thing except for the logic.behavior down here is the only thing which is
		 * different. Can we extract it to a variable?
		 */
		
//		Predicate<? super Integer> evenPredicate = x -> x%2 ==0; //even 
//		numbers.stream()
//			.filter(evenPredicate)
//			.forEach(System.out::println);
//		
//		Predicate<? super Integer> oddPredicate = x -> x%2 ==1;//odd
//		numbers.stream()
//		.filter(oddPredicate)
//		.forEach(System.out::println);
		
		filterAndPrint(numbers, x -> x%2 ==0);
		
		filterAndPrint(numbers, x -> x%2 ==1);
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream()
		.filter(predicate)
		.forEach(System.out::println);
	}
	
}
