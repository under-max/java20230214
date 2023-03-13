package ch16.lecture.p02lambda;

import java.lang.reflect.*;

public class C03Lambda {
	public static void main(String[] args) {
		MyInterface03 o2 = new MyInterface03() {
			@Override
			public void method(int a) {
				System.out.println("익명클래스로 재정의");
				System.out.println("받은 값: " + a);
			}
		};
		
		o2.method(9);
		
		MyInterface03 o1 = a -> {
			System.out.println("파라미터 타입 생략");
			System.out.println("받은 값: " + a);
		};
		o1.method(20);
		
		MyInterface03 o5 = x -> {
			System.out.println("파라미터명 정의");
			System.out.println("받은값 " + x);
		};
		
		o5.method(21);
	}
}

interface MyInterface03 {
	void method(int a);
}
