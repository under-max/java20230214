package ch16.lecture.p02lambda;

public class C01Lambda {
	public static void main(String[] args) {
		//functional interface로 lambda식 만들 수 있음 
		MyInterface01 o1 = () -> System.out.println("재정의된 메소드");
		o1.method01();
		
		MyInterface01 o2 = () -> System.out.println("또다른 메소드2");
		o2.method01();
	}
}

@FunctionalInterface
interface MyInterface01 {
	void method01();
	//Object에 있는 메소드는 수에 포함 안됨
	String toString();  
	default void method2() {
		System.out.println("디폴트!");
	}
	
	static void method3() {
		
	}
}

//lambda expression
//추상메소드가 하나인 interface의 익명클래스 객체 만드는 코드

//functional interface : 추상메소드가 하나인 interface
