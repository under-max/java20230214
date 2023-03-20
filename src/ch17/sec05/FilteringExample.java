package ch17.sec05;

import java.util.*;
import java.util.stream.*;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("김자바");
		list.add("신용권");
		list.add("신민철");
		
		
		//중복요소 제거
		list.stream().distinct()
		.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		//신으로 시작하는 요소만 필터링
		
		list.stream()
		.filter(s -> s.startsWith("신"))
		.forEach(s-> System.out.println(s));
		
		System.out.println();
		//중복요소를 먼저 제거하고 신으로 시작하는 요소만 필터링
		list.stream()
		.distinct()
		.filter(n -> n.startsWith("신"))
		.forEach(n -> System.out.println(n));
		
	}
}
