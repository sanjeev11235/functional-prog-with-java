package com.funcInterfaces_Lambdas;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP04BehaviorParameterizationEX {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		filterAndPrint(numbers, x -> x%3 == 0);
		
		List<Integer> squaredNumbers = mapAndCreateNewList(numbers, x -> x*x);
		List<Integer> cubedNumbers = mapAndCreateNewList(numbers, x -> x*x*x);
		List<Integer> doubledNumbers = mapAndCreateNewList(numbers, x -> x + x);
		System.out.println(squaredNumbers);
		System.out.println(cubedNumbers);
		System.out.println(doubledNumbers);
	}

	private static List<Integer> mapAndCreateNewList(List<Integer> numbers,
			Function<Integer, Integer> mappingFunction) {
		return numbers.stream()
				.map(mappingFunction)
				.collect(Collectors.toList());
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream()
		.filter(predicate)
		.forEach(System.out::println);
	}
	/*
	 * So, in that sense, just like you would be able to pass data to a method,
	 * store data in a variable, return data from a method, we can also do the same
	 * things with methods or functions. We can pass methods to another method, we
	 * can store method into a variable, we can return a method from another method.
	 */}
