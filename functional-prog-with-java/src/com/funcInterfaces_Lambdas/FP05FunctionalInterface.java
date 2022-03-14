package com.funcInterfaces_Lambdas;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP05FunctionalInterface {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		Predicate<Integer> isEvenPredicate = x -> x%2 == 0;
		
//		Predicate<Integer> isEvenPredicate = (Integer x) -> x%2 == 0;//method 2 type inference done automatically
		
		Function<Integer,Integer> squareFunction = x -> x * x;
		
		Function<Integer,String> stringOutputFunction = x -> x + " ";

		Consumer<Integer> sysoutConsumer = x -> System.out.println(x);
		
		BinaryOperator<Integer> sumBinaryOperator = (x,y) -> x+y;
		
//		BinaryOperator<Integer> sumBinaryOperator = (Integer x,Integer y) -> x+y;//method 2 type inference done automatically
 
		//No input > Return something
		Supplier<Integer> randomIntegerSupplier = () -> 2;//method 1
		Supplier<Integer> randomIntegerSupplier2 = () -> {//method 2 for multiple statement
			Random random = new Random();
			return random.nextInt(1000);
		};

		System.out.println(randomIntegerSupplier.get());
		System.out.println(randomIntegerSupplier2.get());
		
		//unary operator
		UnaryOperator <Integer> unaryOperator = (x) -> 3 * x;
		System.out.println(unaryOperator.apply(10));
		
		//BiPredicate
		BiPredicate<Integer, String> biPredicate = (number,str) -> true;//single output statement
		BiPredicate<Integer, String> biPredicate2 = (number,str) -> {//multiple output statement
			return number < 10 && str.length() > 5;
		};
		
		System.out.println(biPredicate.test(5, "test"));
		System.out.println(biPredicate2.test(15, "test"));
		
		//BiFunction
		BiFunction<Integer, String, String> biFunction = (number,str) -> {//multiple output statement
			return number +" "+ str ;
		};
		System.out.println(biFunction.apply(15, "test"));
		
		
		//BiConsumer
		BiConsumer<Integer, String > biConsumer = (s1, s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};
		biConsumer.accept(25, "Test");
		
		//lambda with primitives
		
		//IntBinaryOperator
		IntBinaryOperator intBinaryOperator = (x,y) -> x + y;
		
	}

}
