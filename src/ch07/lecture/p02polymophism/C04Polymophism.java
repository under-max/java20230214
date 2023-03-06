package ch07.lecture.p02polymophism;

import java.util.*;

public class C04Polymophism {
	public static void main(String[] args) {
		String s1 = "java";
		Scanner scanner = new Scanner("");
		
		method1(s1);
		method1(scanner);
	}
	public static void method1(Object o) {
//		o.charAt(0); 실행 안됨 
//		o.nextLine();
		
		String s = o.toString();
		System.out.println(s);
	}
}
