package ch06.lecture.p07constructor;

public class MyClass03 {
	String name;
	int age;
	
	public MyClass03() {
		name = "Son";
		age = 77;
	}
	
	void descript() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}
