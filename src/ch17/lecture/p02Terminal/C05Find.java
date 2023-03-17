package ch17.lecture.p02Terminal;

import java.util.*;

public class C05Find {
	public static void main(String[] args) {
		//FindFirst
		//FindAny
		
		//Optional 있을수도 있고 없을수도 있고 
		//Container Value 
		Optional<String> o1 = Optional.of("Java");
		
		System.out.println(o1.isPresent());
		System.out.println(o1.isEmpty());
		
		String s1 = o1.get();
		System.out.println(s1);
		System.out.println();
		String s2 = o1.orElse("default");
		
		Optional<String> o2 = Optional.ofNullable(null);
		System.out.println(o2.isEmpty());
		System.out.println(o2.isPresent());
//		String s3 = o2.get();
		String s4 = o2.orElse("default");
		System.out.println(s4);
		
	}
}
