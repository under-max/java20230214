package ch17.lecture.p02Terminal;

import java.util.*;

public class C06Find {
	public static void main(String[] args) {
		//findany
		//findfirst
		
		List<Integer> list = List.of(3,1,9,0,2,4);
		Optional<Integer> v1 = list.stream().findFirst();
		System.out.println(v1);
		
		Integer v2 = list.stream().findAny().get();
		System.out.println(v2);
		
		List<Integer> list2 = List.of();
		Optional<Integer> v3 = list2.stream().findFirst();
		System.out.println(v3.isPresent());
		if(v3.isPresent()) {
			System.out.println(v3.get());
		}
		System.out.println(v3.orElse(0));
	}
}
