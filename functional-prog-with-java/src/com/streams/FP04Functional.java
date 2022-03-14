package com.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FP04Functional {// simplified approach in comparison to FP01Functional

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<Integer> evenNumbersOnly = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbersOnly);
	}

}
