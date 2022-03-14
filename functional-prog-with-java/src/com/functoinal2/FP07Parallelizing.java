package com.functoinal2;

import java.util.stream.LongStream;


public class FP07Parallelizing {

	public static void main(String[] args) {
		//0,1000000000
		long time =System.currentTimeMillis();
		System.out.println(LongStream.range(0,1000000000).sum());
		//tooks 1231 seconds
//		System.out.println(LongStream.range(0,1000000000).parallel().sum());//using system cores for performing parallel
		//tooks 107 seconds
		System.out.println(System.currentTimeMillis() - time);
	}
}
