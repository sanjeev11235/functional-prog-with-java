package com.funcInterfaces_Lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP01FunctionalInterfaces {

	/*
	 * boolean isEven(int x){ return x%2 == 0; }
	 * 
	 * int squared(int x){ return x * x; }
	 */

	public static void main(String[] args) {
		/*
		 * List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		 * 
		 * numbers.stream() .filter(x -> x%2 ==0)//lambda exp .map( x -> x*x)//lambda
		 * exp .forEach(System.out::println);//method ref.
		 */

		// extracting to its local variable
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
		// how it works internally
		/*
		 * Predicate<Integer> isEvenPredicate = new Predicate<Integer>() {
		 * 
		 * @Override public boolean test(Integer x) { return x % 2 == 0; } };
		 */

		Function<Integer, Integer> sqareFunciton = x -> x * x;
		//how it works internally
		/*
		 * Function<Integer, Integer> sqareFunciton = new Function<Integer, Integer>(){
		 * 
		 * @Override public Integer apply(Integer x) { // TODO Auto-generated method
		 * stub return x*x; }
		 * 
		 * };
		 */
		
		
		Consumer<Integer> action = System.out::println;// as we want it works with integer,that's why we replaced question mark with a integer
		//how it works internally
		/*
		 * Consumer<Integer> action = new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer x) { System.out.println(x); }
		 * 
		 * };
		 */
		numbers.stream()
				.filter(isEvenPredicate)// lambda exp
				.map(sqareFunciton)// lambda exp
				.forEach(action);// method ref.
	}
}
