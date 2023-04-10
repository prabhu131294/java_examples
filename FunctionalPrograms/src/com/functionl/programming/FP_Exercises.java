package com.functionl.programming;

import java.util.List;

public class FP_Exercises {
	public static void main(String args[]) {
		List<Integer> list1 = List.of(10, 27, 38, 42, 53, 18, 20, 45, 98);
		
		
		//1. Print only odd numbers from list
		System.out.println("*********");
		list1.stream()
			.filter(number->number%2!=0)
			.forEach(System.out::println);
		
		
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		//2. Print all courses individually
		System.out.println("*********");
		courses.stream()
			.forEach(System.out::println);
		
		
		//3. Print courses containing the word "Spring"
		System.out.println("*********");
		courses.stream()
			.filter(course->course.contains("Spring"))
			.forEach(System.out::println);
		
		
		//4. Print courses whose names has at least 4 letters
		System.out.println("*********");
		courses.stream()
		.filter(course->course.length()>=4)
		.forEach(System.out::println);
		
		
		//5. Print the cubes of odd numbers
		System.out.println("*********");
		list1.stream()
		.filter(number->number%2==1)
		.map(number->number*number*number)
		.forEach(System.out::println);
		
		//6. Print the number of characters in course name
		System.out.println("*********");
		courses.stream()
		.map(course->course+"="+course.length())
		.forEach(System.out::println);
		
		
	}
}
