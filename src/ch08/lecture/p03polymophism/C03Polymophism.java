package ch08.lecture.p03polymophism;

public class C03Polymophism {
	public static void main(String[] args) {
		MyInterface03[] arr = new MyInterface03[5];
		arr[0] = new MyClass03();
		arr[1] = new MyClass04();
	}
}

interface MyInterface03 {}

class MyClass03 implements MyInterface01{}

class MyClass04 implements MyInterface01{}
