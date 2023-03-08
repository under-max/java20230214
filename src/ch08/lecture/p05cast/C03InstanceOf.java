package ch08.lecture.p05cast;

public class C03InstanceOf {
	public static void main(String[] args) {
		MyInterface02 o1 = new MyClass021();
		MyInterface02 o2 = new MyClass022();
		
		boolean a = o1 instanceof MyClass021;
		boolean b = o1 instanceof MyInterface02;
		
		System.out.println(a + " " + b + " ");
		
		System.out.println(o2 instanceof MyClass022);
		System.out.println(o2 instanceof MyInterface02);
		System.out.println();
		System.out.println(o1 instanceof MyClass022);
		System.out.println(o2 instanceof MyClass021);
		
	}
}
