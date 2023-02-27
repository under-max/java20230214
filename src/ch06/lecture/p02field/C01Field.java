package ch06.lecture.p02field;

public class C01Field {
	public static void main(String[] args) {
		MyClass01 var1 = new MyClass01();
		
		var1.age = 123;
		var1.name = "김자바";
		var1.score = 345457;
		
		System.out.println(var1.age);
		System.out.println(var1.name);
		System.out.println(var1.score);
		
		MyClass01 var2 = new MyClass01();
		
		var2.age = 88;
		var2.name = "cha";
		var2.score = 200;
		
		System.out.println(var2.age);
		System.out.println(var2.name);
		System.out.println(var2.score);
		
	}
}
