package ch08.lecture.p04etc;

public interface MyInterface02 {
	//private 메소드
	private default void common() {
		System.out.println("공통된 코드들");
	}
	default void method1() {
		common();
		System.out.println("메소드1 코드들");
		
	}
	
	default void method2() {
		System.out.println("공통된 코드들");
		System.out.println("메소드2 코드들");
	}
}
