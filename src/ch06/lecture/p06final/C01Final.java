package ch06.lecture.p06final;

public class C01Final {
	public static void main(String[] args) {
		//final: 값을 한번만 할당 할수 있다. 
		
		int i = 0;
		
		final int b = 5;
		
		
	}
	
	static void method(int i) {
		System.out.println(i);
		i = 5;
		System.out.println(i);
	}
	
	static void method1(final int i) {
		System.out.println(i);
//		i = 9; 안됨
//		System.out.println(i);
	}
}
