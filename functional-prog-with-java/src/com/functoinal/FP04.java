package com.functoinal;

import java.util.List;

public class FP04 { 

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printEvenNumbersInListStructured(numbers);

	}

	// trying to print even number using struc. approach
	private static void printEvenNumbersInListStructured(List<Integer> num) {
		for (int k : num) {
			if(k %2 ==0) {
				System.out.println(k);
			}
		}
	}
}
