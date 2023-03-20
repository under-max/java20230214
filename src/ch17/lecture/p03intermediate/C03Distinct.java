package ch17.lecture.p03intermediate;

import java.util.*;

public class C03Distinct {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 1, 2, 0, 1, 2, 3);
		
		long count = list.stream()
				.count();
		System.out.println(count);
		
		long count1 = list.stream()
				.distinct() //중복된 요소 제거 
				.count();
		System.out.println(count1);
		
	}
}
