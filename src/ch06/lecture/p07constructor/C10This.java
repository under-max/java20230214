package ch06.lecture.p07constructor;

public class C10This {
	public static void main(String[] args) {
		MyClass10 o1 = new MyClass10("son", 99, "1/2");
		MyClass10 o2 = new MyClass10("son", 99);
		MyClass10 o3 = new MyClass10("son");
		MyClass10 o4 = new MyClass10();
		
		o1.printField();
		o2.printField();
		o3.printField();
		o4.printField();
		
	}
}
