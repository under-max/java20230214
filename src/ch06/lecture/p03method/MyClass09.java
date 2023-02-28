package ch06.lecture.p03method;

public class MyClass09 {
	void method() {
		System.out.println("파라미터 없는 메소드");
	}
	
	void method(int i) {
		System.out.println("파라미터 하나 받는 메소드");
	}
	
	void method(int i, int j) {
		System.out.println("파라미터 두개 받는 메소드");
	}
	void method(int[] args) {
		for(int arg: args) {
			System.out.println("받은 파라미터 : " + arg);
		}
	}
	//가변길이 아규먼트 (varargs)
	void method2(int... args) {
		//args를 배열로 사용 
		for (int arg : args) {
			System.out.println("가변길이 parameter : " + arg);
		}
	}
	
	//가변길이매개변수는 파라미터 목록에서 가장 오른쪽에 작성해야함 
	void method3(String param, int... args) {
		
		for (int arg : args) {
			System.out.println("가변길이 parameter : " + arg);
		}
	}
}
