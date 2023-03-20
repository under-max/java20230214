package ch17.example.exam05;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"THis is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expression");
		
		//대소문자 관계없이 java라는 단어가 포함된 문자열만 필터링 하여 출력
	
		//stream 없는 방식
		System.out.println("고전적 방식");
		
		
		for(String s : list) {
			if(s.toLowerCase().contains("java")) {
				System.out.println(s);
			}
		}
		//stream 으로 푸는 방식
		System.out.println("stream 방식");
		list.stream()
		.filter(s -> s.toLowerCase().contains("java"))
		.forEach(System.out::println);
		
				
		list.stream()
		.filter(Example::havingJava)
		.forEach(System.out::println);
		
	}
	
	private static boolean havingJava(String s) {
		return s.toLowerCase().contains("java");
	}
			
}
