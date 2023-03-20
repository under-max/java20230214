package ch17.lecture.p03intermediate;

import java.util.*;

public class C08Map {
	public static void main(String[] args) {
		//map 매핑 변환
		
		List<Integer> list = List.of(2,1,0,3,9);
		System.out.println("0으로 매핑");
		list.stream()
		.map(s->0)
		.forEach(System.out::println);
		
		System.out.println("짝수로 매핑 *2");
		list.stream()
		.map(s -> s*2)
		.forEach(System.out::println);
		
		
	}
}
