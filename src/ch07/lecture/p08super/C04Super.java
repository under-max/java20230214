package ch07.lecture.p08super;

public class C04Super {

}

class Super04{
	public void method1() {
		
	}
	public void method3() {
		
	}
}

class Sub04 extends Super04 {
	@Override
	public void method3() {
		method1();
		method3();//자기 자신
		super.method3(); //부모 클래스의 method3 명시적으로 표시해주어야 함
	}
	
	public void method2() {
		method1();
	}
}