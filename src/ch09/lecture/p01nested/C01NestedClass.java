package ch09.lecture.p01nested;

public class C01NestedClass {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		MyClass01.Nested01 o2 = o1.new Nested01();
		
		
	}
}

//중첩 클래스(nested Class) 클래스안에 클래스
class MyClass01 {
	//class 작성 가능
	class Nested01 {
		//필드
		//생성자
		//메소드
	}
	//필드
	//생성자
	//메소드
	
	
	
}
