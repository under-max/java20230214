package ch07.lecture.p01inheritance;

public class SubClass03 extends SuperClass03 {
	public void method3() {
		System.out.println("서브클래스 메소드3");
	}
	
	//method1, method2 상속 받음
	//상속받은 method2의 재정의
	//재정의 = 오버라이딩 (override)
	public void method2() {
		System.out.println("서브클래스 메소드2");
	}
	
}
