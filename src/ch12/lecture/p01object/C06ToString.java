package ch12.lecture.p01object;

public class C06ToString {
	public static void main(String[] args) {
		Object o1 = new MyClass06("Son", 77);
		Object o2 = new MyClass06("park", 44);
		
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		
		String answer = "100";
		answer.replaceAll("a", "1");
		System.out.println(answer.replaceAll("1", "a"));
	}
}


class MyClass06{
	private String name; 
	private int age;
	
	MyClass06(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "나이는" + age + "이고 이름은" + name + "입니다.";
	}
}