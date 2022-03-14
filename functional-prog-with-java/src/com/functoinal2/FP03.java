package com.functoinal2;

public class FP03 {

//	jshell> Integer.MAX_VALUE
//	$26 ==> 2147483647
//
//	jshell> Long.MAX_VALUE
//	$27 ==> 9223372036854775807
//
//	jshell> IntStream.rangeClosed(1,50).reduce(1,(x,y)->x*y)
//	$28 ==> 0
//	//Because the result exceeds the limit of the integer max value.
//	jshell> LongStream.rangeClosed(1,50).reduce(1,(x,y)->x*y)
//	$29 ==> -3258495067890909184
	
//	jshell> LongStream.rangeClosed(1,50).reduce(1,(x,y)->x*y)
//	$29 ==> -3258495067890909184
//
//	jshell> LongStream.rangeClosed(1L,50).reduce(1L,(x,y)->x*y)
//	$31 ==> -3258495067890909184
//
//	jshell> LongStream.rangeClosed(1L,10).reduce(1L,(x,y)->x*y)
//	$32 ==> 3628800

//	jshell> LongStream.rangeClosed(1L,20).reduce(1L,(x,y)->x*y)
//	$33 ==> 2432902008176640000
//
//	jshell> LongStream.rangeClosed(1L,40).reduce(1L,(x,y)->x*y)
//	$34 ==> -70609262346240000

//	jshell> LongStream.rangeClosed(1L,50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply)
//	$35 ==> 30414093201713378043612608166064768844377641568960512000000000000
	//I can create a big integer value.I can map to object.So, I'd want to take each of these elements and map it to a big integer object.
	//How can I create a big integer value?
	//I'd need to say BigInteger::vvalueOf.So, we'd want to create a instance of the BigIntegerI would want to type in BigInteger.ONE and over here,
	//I can leave it as it is or I can say, BigInteger::multiply.
}
