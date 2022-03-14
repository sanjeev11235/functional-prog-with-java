package com.funcInterfaces_Lambdas;

import java.util.List;
import java.util.function.BinaryOperator;

public class FP02FunctionalInterfaces {

	// find the functional interface behind the second arg. of reduce method.

	/*
	 * boolean isEven(int x){ return x%2 == 0; }
	 * 
	 * int squared(int x){ return x * x; }
	 */

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

//		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		// how it works internally
		BinaryOperator<Integer> sumBinaryOperator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer a, Integer b) {
				return a + b;
			}

		};

		int sum = numbers.stream().filter(x -> x % 2 == 1).reduce(0, sumBinaryOperator);

		System.out.println(sum);

	}
}
