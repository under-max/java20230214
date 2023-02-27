package ch06.lecture.p03method;

public class C07Parameter {
	public static void main(String[] args) {
		MyClass07 o1 = new MyClass07();
		
		o1.method1(9);
		o1.method1(2321564L);
		o1.method1(9,5);
		o1.method1(9, "23");
		o1.method1("9", 235);
		
	}
}
