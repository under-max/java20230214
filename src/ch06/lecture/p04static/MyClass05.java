package ch06.lecture.p04static;

public class MyClass05 {
	String name;
	
	static String model;
	
	void printName() {
		System.out.println(name);
	}
	
	static void printModel() {
		System.out.println(model);
//		System.out.println(name); 안됨
	} 
}
