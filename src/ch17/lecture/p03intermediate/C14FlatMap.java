package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C14FlatMap {
	public static void main(String[] args) {
		// flatMap
		// 원래 원소를 다른 원소들로 매핑

		List<Integer> list = List.of(3, 4, 5);
		
		//map: 1 대 1
		long count1 = list.stream()
				.map(e->e)
				.count();
		System.out.println(count1);
		
		//flatMap: 1대 다 (0~?)
		long count2 = list.stream().flatMap(e-> Stream.of(0,0)).count();
		System.out.println(count2);
		
		list.stream().flatMap(e-> Stream.of(e,e+3)).forEach(System.out::println);
		
		System.out.println("--------");
		int[] array = {3, 10, 28};
		int n = 20;
		Arrays.stream(array).flatMap(d -> d - n < 0 ? IntStream.of(d, n-d) : IntStream.of(d, d-n)).min().stream().map(d->)
		forEach(System.out::println);
	}
}
