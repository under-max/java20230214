package ch06.lecture.p10access.package1;

public class C02AccessModifier {
	public static void main(String[] args) {
		MyClass02  o1 = new MyClass02();
		System.out.println(o1.name);
//		System.out.println(o1.age); private 라 안됨 
		System.out.println(o1.married); //default 지만 같은 패키지 안이라 가능
		
		
		o1.method1(); //접근 가능
//		o1.method2();//private라 접근 불가능
		o1.method3(); //default지만 같은 패키지 안이라 가능 
	}
}
