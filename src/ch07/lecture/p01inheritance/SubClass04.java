package ch07.lecture.p01inheritance;

public class SubClass04 extends SuperClass04 {
	
	//SuperClass04 method1의 재정의
	@Override//재정의 메소드인지 컴파일러가 검증 오버라이드시에는 붙여둘것
	public void method1() {
		System.out.println("Sub Method1");
	}
	
	@Override //어노테이션
	public void method2() {
		System.out.println("sub Method2");
	}
}
