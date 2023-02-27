package ch06.lecture.p03method;

public class C06Parameter {
	public static void main(String[] args) {
		//자동형변환 
		int a = 3;
		long b = a;
		double c = b;
		char d = 'c';
		int e = d;
		System.out.println(e);
		
		MyClass06 o1 = new MyClass06();
		
		o1.method1(33);
		o1.method1('c');
		
		o1.method2(2525465446846513213L);
		o1.method2('c');
		o1.method2(123);
		
		o1.method3(3.14);
		o1.method3(231345646876876L);
		o1.method3(55);
		
		
		o1.method1(3.14f);
		o1.method1(286442L);
		o1.method1(99);
//		o1.method1(3.14);//안되고
		
	}
}
