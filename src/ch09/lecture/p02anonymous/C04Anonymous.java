package ch09.lecture.p02anonymous;

public class C04Anonymous {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04() {
			@Override
			void method1() {
				System.out.println("자동구현!");
			}
		};
		
		o1.method1();
		
		
	}
}
	


abstract class MyClass04 {
	abstract void method1();
}
