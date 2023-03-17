package ch17.lecture.p02Terminal;

import java.util.*;
import java.util.stream.*;

public class C16Collect {
	public static void main(String[] args) {
		List<Integer> list = List.of(3,2,3,2,2,2);
		Map<Integer, Long> r1 = list.stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));
		System.out.println(r1);
	}
}
