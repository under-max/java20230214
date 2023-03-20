package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C07Filter {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 9, -1, 0, 2, -3, -6, 7, 8);
		
		
		//
		System.out.println("0이상");
		list.stream().filter(a -> a > 0) //Parameter 1개 
		.forEach(System.out::println);
		
		System.out.println("짝수만");
		list.stream().filter(a -> a % 2 == 0 && a > 0).forEach(System.out::println);
		
		System.out.println("홀수만");
		list.stream().filter(n -> n % 2 == 1).forEach(System.out::println);
		
		List<Integer> list1 = list.stream().filter(n->n%2 == 1).collect(Collectors.toList());
	}
}
