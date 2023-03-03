package ch06.lecture.p07constructor;

public class MyClass10 {
	String name;
	int age;
	String birthDate;
	
	
	MyClass10(){};
	
	MyClass10(String name){
		this.name = name;
	}
	
	MyClass10(String name, int age){
		this(name);
//		this.name = name;
		this.age = age;
	};
	//this 앞으로 만들어질 참조변수를 대신함
	
	MyClass10(String name, int age, String birthDate){
		//this()다른생성자 호출
		this(name, age);
//		this.name = name;
//		this.age = age;
		this.birthDate = birthDate;
	};
	
	void printField() {
		System.out.println("name: " + name + ", age: " + age + ", birthDate: " + birthDate);
	}
}
