package ch07.lecture.p02polymophism;

public class C01Polymophism {
	public static void main(String[] args) {
		SubClass01 o1 = new SubClass01();
		
		SuperClass01 o2 = o1;//자동형변환 타입이 중요한게 아니라 들어간 인스턴스가 중요
		
		o2.method1();
	}
}

class SuperClass01 {
	public void method1() {
		System.out.println("super method1");
	}
}

class SubClass01 extends SuperClass01 {
	@Override
	public void method1() {
		System.out.println("sub method1");
	}
}
