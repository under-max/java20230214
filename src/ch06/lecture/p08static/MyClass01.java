package ch06.lecture.p08static;

public class MyClass01 {
	//필드
	
	//인스턴스 필드
	String name;
	
	//정적필드
	static String company; 
	
	//생성자: 인스턴스 필드 초기화(주로)
	public MyClass01() {
		name = "son";
	}
	
	//static initialization block : 스태틱필드 초기화(주로) 
	//정적초기화 블럭
	static {
		//명령문들....
		company = "Sansung";
	}
	
	
}
