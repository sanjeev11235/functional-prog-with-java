package com.functoinal2;

public class FP02 {

//	jshell> IntStream.range(1,10)
//	$16 ==> java.util.stream.IntPipeline$Head@4f2410ac
//
//	jshell> IntStream.range(1,10).sum()//only numbers 1 to 9 are part of the stream, 10 is not included.
//	$17 ==> 45
//
//	jshell> IntStream.rangeClosed(1,10).sum()// if you'd want 10 also to be included, you can use rangeClosed.
//	$18 ==> 55
	
//	jshell> IntStream.iterate(1, e -> e + 2).limit(10).sum()
//	$21 ==> 100
	//by using IntStream.,you can do something called an iterate. So, in an iterate, you can specify the starting value. Again, specify
	//the starting value and I can use the algorithm I would want to use to iterate. What I would want to do is, I'd want to take each element and increment
	//by 2. So, this is basically a infinite stream and when we are looking at infinite stream, we would want to actually I would want to limit the number of elements down to 10. So, this would create a stream for us.
	
//	jshell> IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum()
//	1
//	3
//	5
//	7
//	9
//	11
//	13
//	15
//	17
//	19
//	$22 ==> 100
	//peek method will allow us to look into this stream without making any changes to the actual stream.

//	jshell> IntStream.iterate(2, e -> e + 2).limit(10).peek(System.out::println).sum()
//	2
//	4
//	6
//	8
//	10
//	12
//	14
//	16
//	18
//	20
//	$23 ==> 110
	//It print all the even numbers from 2 to 20 and it adds them up.
	
//	jshell> IntStream.iterate(2, e -> e * 2).limit(10).peek(System.out::println).sum()
//	2
//	4
//	8
//	16
//	32
//	64
//	128
//	256
//	512
//	1024
//	$24 ==> 2046
	//I would want to calculate the first 10 powers of 2

//	jshell> IntStream.iterate(2, e -> e * 2).limit(10).collect(Collectors.toList())
//	|  Error:
//	|  method collect in interface java.util.stream.IntStream cannot be applied to given types;
//	|    required: java.util.function.Supplier<R>,java.util.function.ObjIntConsumer<R>,java.util.function.BiConsumer<R,R>
//	|    found:    java.util.stream.Collector<java.lang.Object,capture#3 of ?,java.util.List<java.lang.Object>>
//	|    reason: cannot infer type-variable(s) R
//	|      (actual and formal argument lists differ in length)
//	|  IntStream.iterate(2, e -> e * 2).limit(10).collect(Collectors.toList())
//	|  ^------------------------------------------------^
//	|  Error:
//	|  incompatible types: cannot infer type-variable(s) R
//	|      (argument mismatch; no instance(s) of type variable(s) capture#4 of ?,T exist so that java.util.stream.Collector<T,?,java.util.List<T>> conforms to java.util.function.Supplier<R>)
//	|  IntStream.iterate(2, e -> e * 2).limit(10).collect(Collectors.toList())
//	|  ^---------------------------------------------------------------------^
	//I'd want to get 10 powers of 2 and I would want to store them into a list.
	//However, this would give us an error. It's because we cannot apply the collect directly on a primitive stream.

//	jshell> IntStream.iterate(2, e -> e * 2).limit(10).boxed().collect(Collectors.toList())
//	$25 ==> [2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]
			//Before we actually apply a collect on a primitive streams,we'd need to do something called a boxed operation. So, we need to do a boxed; so, .boxed(), call that method
			//and then we would be able to collect and then we would have a list created for us.
}
