package ch06.lecture.p03method;

public class MyClass11 {
	void method1() {
		System.out.println("실행문1");
		System.out.println("실행문2");
		
		return; //메소드종료
		
//		System.out.println("h1");
	}
	
	void method2() {
		System.out.println(1);
		
		if(true) {
			return; //메소드 종료
		}
		System.out.println(2);
	}
	
}
