package com.streams;

import java.util.List;

public class FP01Functional {// Structured approach

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		int sum = addListFunctional(numbers);
		System.out.println(sum);
	}
//	0 12
//	12 9
//	21 13
//	34 4
//	38 6
//	44 2
//	46 4
//	50 12
//	62 15
//	77
	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate +" "+ nextNumber);
		return aggregate+nextNumber;
	}
	
	private static int addListFunctional(List<Integer> numbers) {
			//combine them into one result => one value
			//0 and (a,b) -> a + b
			// 0 and FP01Functional::sum
			//stream of number -> one result value
		return numbers.stream()
		.reduce(0, FP01Functional::sum);
	}
}
