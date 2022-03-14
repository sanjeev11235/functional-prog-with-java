package com.functoinal;

import java.util.List;

public class FP06 {//simplifying implementation in comparison to FP05 

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printEvenNumbersInListFunctional(numbers);

	}

//	private static boolean isEven(int number) {
//		return number % 2 == 0;
//	}

	// trying to print even number using func. approach
	private static void printEvenNumbersInListFunctional(List<Integer> num) {
		num.stream()
//				.filter(FP06::isEven)// filter only allow even numbers
				.filter(number -> number%2 == 0) //lambda expression
				.forEach(System.out::println);// method reference
	}
}
