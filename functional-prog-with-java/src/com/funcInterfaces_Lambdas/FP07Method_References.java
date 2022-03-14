package com.funcInterfaces_Lambdas;

import java.util.List;
import java.util.function.Supplier;

public class FP07Method_References {

	public static void print(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure","Docker","Kubernates");
		
		
		courses.stream()
//			.map(str -> str.toUpperCase())
			.map(String::toUpperCase)//method reference with class string and its method toUppperCase
//			.forEach(str -> System.out.println(str));
//			.forEach(System.out :: println);
			.forEach(FP07Method_References::print);// here we are calling static method
		
		
//		Supplier <String> supplier =() -> new String();
		Supplier <String> supplier = String::new; //constructor reference
	}
}
