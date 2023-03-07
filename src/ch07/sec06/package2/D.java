package ch07.sec06.package2;

import ch07.sec06.package1.*;

public class D extends A{
	public D() {
		super();
	}
	
	public void method1() {
		//A필드값 변경
		this.field = "value";
		this.method();
				
	}
	
	public void method2() {
//		A a = new A(); 자식객체여도 직접 객체 생성해서 사용하는것은 안됨 
//		a.field = "value";
//		a.method();
	}
}
