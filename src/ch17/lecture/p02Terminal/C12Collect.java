package ch17.lecture.p02Terminal;

import java.util.*;

public class C12Collect {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 9, 8, 7);
		
		List<Integer> list1 = list.stream().collect(ArrayList::new, List::add, (a,b)-> a.addAll(b));
		System.out.println(list1);
	}
}
