package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C02Limit {
	public static void main(String[] args) {
		//limit 크기제한 
		List<String> list = List.of("java", "css", "html", "spring", "jsp");
		Stream<String> stream1 = list
				.stream();
//		stream1.limit(3).forEach(System.out::println);
		
		
		Stream<String> stream2 = stream1
				.limit(3); //스트림 원소 중 3개 제한 
		long count = stream2
				.count();
		System.out.println(count);
		
		long count2 = list
				.stream()
				.limit(3)
				.count();
		System.out.println(count2);
		
		list.stream()
		.limit(3)
		.forEach(System.out::println);
		
	}
}
