package ch08.sec10.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		
		//인터페이스 변수 선언
		A a;
		
		//변수에 구현객체 대입 / 이하 자동타입 변환
		a = b;
		a = c;
		a=  d;
		a = e;
		
	}
}	
