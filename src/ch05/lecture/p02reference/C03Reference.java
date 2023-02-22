package ch05.lecture.p02reference;

public class C03Reference {
	public static void main(String[] args) {
		int a = 3;
		
		method(a);
		
		System.out.println(a); //3
	}
	
	public static void method(int b) {
		System.out.println(b); //3
		b = 30;
		System.out.println(b); //30
	}
}
