package ch06.lecture.p07constructor;

public class MyClass02 {
	String model;
	int price;
	
	//생성자 (Constructor)
	//인스턴스 만들떄 해야하는 일이 있는 코드블럭 
	//(주로 필드초기화)
	//생성자 이름 : 클래스명과 같다 
	
	MyClass02() {
		//명령문들
		System.out.println("인스턴스 만들 때 해야하는 일");
	}
	
	void desc() {
		System.out.println(model + "모델 가격은 " + price + "원");
	}
}
