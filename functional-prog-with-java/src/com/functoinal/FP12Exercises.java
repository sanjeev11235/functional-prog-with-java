package com.functoinal;

import java.util.List;

public class FP12Exercises {//print qubes of odd numbers 

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printSquaresOfOddNumbersInListFunctional(numbers);

	}

	// trying to print odd number using func. approach
	private static void printSquaresOfOddNumbersInListFunctional(List<Integer> num) {
		num.stream()
				.filter(number -> number%2 != 0) //lambda expression
				//mapping :	 x-> x * x
				.map(n -> n * n * n)
				.forEach(System.out::println);// method reference
	}
}
