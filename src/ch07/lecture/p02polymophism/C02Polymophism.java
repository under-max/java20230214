package ch07.lecture.p02polymophism;

public class C02Polymophism {
	public static void main(String[] args) {
		SubClass02 o1 = new SubClass02();
		o1.method1();
		o1.method2();
		System.out.println("--------------");
		
		SuperClass02 o2 = o1;
		o2.method1();
//		o2.method2(); 안됨 참조타입의 변수로 어떤게 실행될지 결정됨 
		
		SuperClass02 o3 = new SubClass022();
		o3.method1();
//		o3.method2(); 안됨
//		o3.method3(); 안됨 
		
	}
}

class SuperClass02 {
	public void method1() {
		System.out.println("super method1");
	}
}

class SubClass02 extends SuperClass02 {
	public void method2() {
		System.out.println("sub method2");
	}
}

class SubClass022 extends SuperClass02{
	public void method3() {
		System.out.println("sub method3");
	}
}