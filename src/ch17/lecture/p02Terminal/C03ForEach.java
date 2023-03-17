package ch17.lecture.p02Terminal;

import java.util.*;
import java.util.stream.*;

public class C03ForEach {
	public static void main(String[] args) {
		//ForEach
		
		List<String> list = List.of("java", "css", "html", "jsp");
		
		list.stream()
		.forEach(System.out::println);
		
		list.stream().forEach(s -> System.out.println("원소: " + s));
		
		List<Integer> list1 = List.of(1,2,3,4,5);
		List<Integer> list2 = list1.stream().filter(a -> a % 2 == 0).limit(5).collect(Collectors.toList());
		System.out.println(list2);
	}
}
