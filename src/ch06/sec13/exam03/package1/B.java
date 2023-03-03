package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		A a = new A();
		
		a.field1 = 1; //o
		a.field2 = 1; //o 
//		a.field3 = 1; //x private 접근제한자 사용중
		
		//메소드 호출
		a.method1(); //o
		a.method2(); //o default 지만 같은 패키지 내
//		a.method3(); //x private 메소드 접근 불가
		
		
		
		
	}
}
