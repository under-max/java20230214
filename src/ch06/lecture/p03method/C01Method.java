package ch06.lecture.p03method;

public class C01Method {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		
		//메소드 호출 call invoke execute
		
		o1.run();
		o1.wakeUp();
		o1.standUp();
		o1.methodName(1);
		
		MyClass01 o2 = new MyClass01();
		o2.run();
		o2.wakeUp();
		o2.standUp();
		o2.methodName(1);
	}
}
