package ch07.lecture.p03cast;

public class C05Instanceof {
	public static void main(String[] args) {
		method1(new Sub05());
		method1(new Super05());
	}
	public static void method1(Super05 s) {
		System.out.println(s instanceof Super05); //true
		System.out.println(s instanceof Sub05); // ?
		
	}
}

class Super05{}

class Sub05 extends Super05{}