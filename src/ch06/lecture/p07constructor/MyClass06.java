package ch06.lecture.p07constructor;

public class MyClass06 {
	//필드
	String name; 
	int age;
	
	//생성자
	public MyClass06() {
		
	}
	
	public MyClass06(String name) {
		this.name = name;
	}
	
	public MyClass06(int age) {
		this.age = age;
	}
	
	
	MyClass06(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//메소드
	
}
