package com.functionl.programming;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgram01 {

	public static void main(String args[]) {
//		printAllNumbersInListStructured(Arrays.asList(10,24,38,42,50,18,20,45,98));

		printAllNumbersInListStructured(List.of(10, 27, 38, 42, 53, 18, 20, 45, 98)); // List.of ==> Java 9
		printAllNumbersInListFunctional(List.of(10, 27, 38, 42, 53, 18, 20, 45, 98));

		printEvenNumbersInListStructured(List.of(10, 27, 38, 42, 53, 18, 20, 45, 98));
		printEvenNumbersInListFunctional(List.of(10, 27, 38, 42, 53, 18, 20, 45, 98));
		
		List<Integer> list2=List.of(2,3,4,5,6,7);
		printSquareOfEvenNumbers(list2);
	}

	// Structured Approach

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		System.out.println("Print all elements in Old approach");
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		System.out.println("Print Even elements in Old approach");
		for (int number : numbers) {
			if (number % 2 == 0)
				System.out.println(number);
		}
	}

	// Functional Approach

	private static void print(int number) {
		System.out.println(number);
	}

	private static boolean evenNum(int number) {
		return number % 2 == 0;
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		System.out.println("Print all elements in Structured Functional approach");
		// Convert list into stream
		// that means,List==> [10,24,38,42,50,18,20,45,98]
		// Streams ==> 10
		// 24
		// 38,...etc
		System.out.println("PRRINT==> Via Method");
		numbers.stream().forEach(FunctionalProgram01::print);

		System.out.println("PRINT==> Via Direct");
		System.out.println("List==>" + numbers);
		numbers.stream().forEach(System.out::println); // Method reference
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		System.out.println("EVEN==> Via Method");
		numbers.stream().filter(FunctionalProgram01::evenNum).forEach(FunctionalProgram01::print);

		System.out.println("EVEN==> Via Lambda");
		// Lambda expression number-> number%2==0
		numbers.stream().filter(number -> number % 2 == 0).forEach(FunctionalProgram01::print); // Method reference

	}
	
	
	private static void printSquareOfEvenNumbers(List<Integer> numbers) {
		System.out.println("printSquareOfEvenNumbers");
		numbers.stream()
			.filter(number->number%2==0)	// Filter
			.map(number->number*number)		// Map
			.forEach(System.out::println);  // Method Reference
	}
	
}
