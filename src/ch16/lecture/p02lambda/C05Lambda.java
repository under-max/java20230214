package ch16.lecture.p02lambda;

public class C05Lambda {
	public static void main(String[] args) {
		MyInterface05 o1 = new MyClass05();
		int r1 = o1.method();
		
		MyInterface05 o2 = () -> {
			System.out.println("람다로 명령문 작성");
			return 0;
		};
		
		int r2 = o2.method();
		
		MyInterface05 o4 = () -> {
			return 2;
		};
		int r4 = o4.method();
		
		MyInterface05 o3 = () -> 5;
		int r3 = o3.method();
		
		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
		
	}
	
	
}

class MyClass05 implements MyInterface05{
	@Override
	public int method() {
		System.out.println("명령문 작성");
		return 0;
	}
}

interface MyInterface05{
	int method();
}
