package ch08.lecture.p04etc;

public interface MyInterface01 {
	void method1();
	
	//새로운 method 등장! 다향성 없이 구현한 클래스에서 같은일을 처리하는 method 라면 interface 자체에서 처리 
	
	//default method : interface의 구현된 메소드
	//접근제한자 생략하면 public 
	default void method2() {
		System.out.println("Interface의 default method");
		System.out.println("body가 있는 메소드");
	}
	
}
