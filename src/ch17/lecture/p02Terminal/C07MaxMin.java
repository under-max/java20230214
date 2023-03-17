package ch17.lecture.p02Terminal;

import java.util.*;

public class C07MaxMin {
	public static void main(String[] args) {
		//Stream Max -> Optional return 
		
		
		List<Integer> list = List.of(3, 4, 1, 2, 10, 20);
		Integer max = list.stream().
		max((x,y)-> x - y) //(x,y) -> Integer.compare(x,y)
		.get();
		
		System.out.println(max);
		
		Integer min = list.stream()
				.min(Integer::compareTo)
				.get(); //(x,y) -> x.compareTo(y)
		System.out.println(min);
		
		
		
	}
}
