package ch06.lecture.p10access.package1;

public class MyClass03 {
	//어디서든지 접근 가능
	public MyClass03() {
		// TODO Auto-generated constructor stub
	}
	//같은 클래스
	private MyClass03(int i){
		
	}
	//같은 패키지 내에서만 접근 가능
	MyClass03(String s){
		
	}
	
	public void method() {
		MyClass03 o1 = new MyClass03(3);//같은 클래스 내여서 접근 가능 
	}
}
