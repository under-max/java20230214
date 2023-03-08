package ch12.lecture.p01object;

public class C05ToString {
	public static void main(String[] args) {
		Object o1 = new MyClass05();
		Object o2 = new MyClass05();
		
		System.out.println(o1.toString());
		System.out.println(o2.toString());
	}
}

class MyClass05{
	
	public String toString() {
		return "~~~****~~~~";
	}
}