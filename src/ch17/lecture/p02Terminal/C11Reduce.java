package ch17.lecture.p02Terminal;

import java.util.*;

public class C11Reduce {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 4, 5, 1);
		Integer r1 = list.stream().reduce(0, Integer::sum); //P 2개 
		System.out.println(r1);
		
		
		Integer r2 = list.stream().reduce(1, (a,b)-> a * b);
		System.out.println(r2);
	}
}
