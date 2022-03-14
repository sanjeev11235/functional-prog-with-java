package com.functoinal;

import java.util.List;

public class FP02 {//Functional approach

	public static void main(String[] args) {
		printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

	private static void print(int number) {
		System.out.println(number);
	}

	private static void printAllNumbersInListFunctional(List<Integer> num) {
		// convert list of numbers into streams
		num.stream().forEach(FP02::print);// method reference

	}
}
