package ch17.lecture.p03intermediate;

import java.util.*;

public class C06Peek {
	public static void main(String[] args) {
		(new Random()).ints(5)
		.peek(System.out::println)//중간에 일이 잘 처리되고 있는지 확인용 
		.forEach(System.out::println);
		
	}
}
