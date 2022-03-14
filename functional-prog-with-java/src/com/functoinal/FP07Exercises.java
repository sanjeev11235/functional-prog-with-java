package com.functoinal;

import java.util.List;

public class FP07Exercises {//simplifying implementation in comparison to FP05 

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printOddNumbersInListFunctional(numbers);

	}

	// trying to print odd number using func. approach
	private static void printOddNumbersInListFunctional(List<Integer> num) {
		num.stream()
//				.filter(FP06::isEven)// filter only allow even numbers
//				.filter(number -> number%2 == 1) //lambda expression, odd method1
				.filter(number -> number%2 != 0) //lambda expression, odd method2
				.forEach(System.out::println);// method reference
	}
}
