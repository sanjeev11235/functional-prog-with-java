package com.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FP03Functional {// simplified approach in comparison to FP01Functional

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<Integer> squareNumbers = squareList(numbers);
		System.out.println(squareNumbers);
	}

	private static List<Integer> squareList(List<Integer> numbers) {
		// 1 -1
		// 5 -25
		return numbers.stream().map(number -> number * number).collect(Collectors.toList());
	}

}
