package ch09.lecture.p02anonymous;

public class C08Anonymous {
	public static void main(String[] args) {
		MyInterface08 o1 = new MyInterface08() {
			@Override
			public void method1() {
				System.out.println("재정의된 메소드");
			}
		};
	}
}

interface MyInterface08 {
	void method1();
}
