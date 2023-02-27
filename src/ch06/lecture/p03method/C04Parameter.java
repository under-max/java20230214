package ch06.lecture.p03method;

public class C04Parameter {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();
		o1.method1();
		//메소드 실행시 정의된 파라미터 타입과 순서 개수에 맞춰서 
		//argument를 입력해야함 
//		o1.method1(1);안됨
		
		o1.method2(5);
		
		o1.method3("ababab");
		
		String s1 = "Java";
		o1.method3(s1);
		o1.method3(null);
		o1.method4(2,34);
		o1.method5("아", "이");
		o1.method6(12, "12");
		o1.method7("15", 15);
	}
}
