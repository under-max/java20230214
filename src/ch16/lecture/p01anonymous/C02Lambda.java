package ch16.lecture.p01anonymous;

public class C02Lambda {
	public static void main(String[] args) {
		MyInterface02 o1 = () -> System.out.println("재정의 한 메소드");
		
		o1.method1();
		
		MyInterface02 o2 = () -> System.out.println("재정의한 메소드2");
		o2.method1();
		
		
	}
}

interface MyInterface02 {
	void method1();
	
}
