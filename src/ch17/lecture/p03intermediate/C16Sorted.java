package ch17.lecture.p03intermediate;

import java.util.*;

public class C16Sorted {
	public static void main(String[] args) {
		//sorted : 정렬된 stream return
		List<String> list1 = List.of(
				"chisoo",
				"backho",
				"taewoong",
				"taesup",
				"daeman");
		
		list1.stream().sorted().forEach(System.out::println);
		
	}
	
	
}
