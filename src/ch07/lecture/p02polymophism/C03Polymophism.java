package ch07.lecture.p02polymophism;

import java.util.*;

public class C03Polymophism {
	public static void main(String[] args) {
		String s1 = "Hello";
		Object o1 = s1;
		
		Object o2 = "Java";
		char c1 = s1.charAt(0);
//		o1.charAt(0)안됨 object 메소드에는 charAt이라는 메소드가 없음 
		
		Scanner scanner = new Scanner(System.in);
		Object o3 = scanner;
		
		Object o4 = new Scanner("");
		
		scanner.nextLine();
		
//		o3.nextLine(); object class 안에 nextLine이라는 method 는 존재하지 않음 
//		o4.nextLine();
	}
}
