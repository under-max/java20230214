package ch09.lecture.p02anonymous;

public class C02Anonymous {
	public static void main(String[] args) {
		
		//상속과 인스턴스 생성을 동시에 진행 -> Anonumous class 
		MyClass02 o1 = new MyClass02() {
			//클래스 구현 
			
		};
		
	}
}

class MyClass02{
	
}

class SubClass02 extends MyClass02 {
	//구현부
}