package ch08.lecture.p03polymophism;

public class C06Polymophism {
	public static void main(String[] args) {
		MyInterface06 o1 = method(); //타입이 interface이기 떄문에 변수타입은 Myinterface이거나 혹은 더 높은 타입 
		
	}
	
	public static MyInterface06 method() {
//		return new MyClass06();
		return new MyClass07(); // 둘다 return 가능 MyInterface type 이기 때문에 본인이거나 그 자식 들 
	}
}

interface MyInterface06 {}
class MyClass06 implements MyInterface06 {}
class MyClass07 implements MyInterface06 {}
