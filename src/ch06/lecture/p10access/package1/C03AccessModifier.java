package ch06.lecture.p10access.package1;

public class C03AccessModifier {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03(); //public 이라가능
//		MyClass03 o2 = new MyClass03(5); //private라 접근 불가
		MyClass03 o3 = new MyClass03("Hello"); //default 지만 같은 패키지 내여서 접근 가능
		
	}
}
