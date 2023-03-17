package ch17.lecture.p02Terminal;

import java.util.*;

public class C10Reduce {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "jsp");
		
		Integer o1 = list.stream()
				.map(e->e.length())
				.reduce(Integer::sum)
				.get();
		System.out.println(o1);
	}
}
