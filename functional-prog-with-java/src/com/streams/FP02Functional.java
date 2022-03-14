package com.streams;

import java.util.List;

public class FP02Functional {//simplified approach in comparison to FP01Functional

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		int sum = addListFunctional(numbers);
		System.out.println(sum);
	}
	
//	private static int sum(int aggregate, int nextNumber) {
//		System.out.println(aggregate +" "+ nextNumber);
//		return aggregate+nextNumber;
//	}
	
	private static int addListFunctional(List<Integer> numbers) {
			//combine them into one result => one value
			//0 and (a,b) -> a + b
			// 0 and FP01Functional::sum
			//stream of number -> one result value
		return numbers.stream()
//		.reduce(0, FP02Functional::sum);//works with sum method defined in class
//		.reduce(0, Integer::sum);//Integer class has default sum method
		.reduce(0, (x,y) -> x+y);//using lambda
	}
}
