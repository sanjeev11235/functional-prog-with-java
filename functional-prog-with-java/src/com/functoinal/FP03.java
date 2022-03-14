package com.functoinal;

import java.util.List;

public class FP03 {// simplifying implementation in comparison to FP02

	public static void main(String[] args) {
		printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

	private static void printAllNumbersInListFunctional(List<Integer> num) {
		// convert list of numbers into streams
		num.stream().forEach(System.out::println);// method reference

	}
}
