package ch06.lecture.p03method;

public class C09VarArgs {
	public static void main(String[] args) {
		MyClass09 o1 = new MyClass09();
		o1.method();
		o1.method(3);
		o1.method(5, 7);
		o1.method(new int[] {});
		o1.method(new int[] { 3 });
		o1.method(new int[] { 9, 10 });
		o1.method(new int[] { 100, 200, 300 });

		o1.method2();
		o1.method2(5);
		o1.method2(100, 200);
		o1.method2(99, 88, 77, 66, 55);
		
		o1.method2(new int[] {0,3,5,4});
		
	}
}
