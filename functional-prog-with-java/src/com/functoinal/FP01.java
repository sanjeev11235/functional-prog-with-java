package com.functoinal;

import java.util.List;

public class FP01 {//Structured approach

	public static void main(String[] args) {
		printAllNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
	}

	private static void printAllNumbersInListStructured(List<Integer> of) {
		for(int k:of) {
			System.out.println(k);
		}
	}
}
