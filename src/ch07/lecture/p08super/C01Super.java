package ch07.lecture.p08super;

public class C01Super {
	public static void main(String[] args) {
		Sub01 o1 = new Sub01();
	}
	
}

class Super01{
	public Super01() {
		System.out.println("상위클래스 초기화 코드");
	}
}
	//이클래스로 인스턴스 만들때 해야하는 일 
	
class Sub01 extends Super01 {
	public Sub01() {
		super();
		System.out.println("자식클래스 초기화 코드");
	}
	
}
	//그전에 상위 클래스의 초기화 작읍을 해야함
	//상위클래스 생상자 호출코드 
	//super(); 꼭 먼저 해야함 (작성하지 않으면 자동으로 삽입됨)
	//자식클래스의 생성자에 자리잡고 있는데 생성자의 가장 윗부분에 자리잡고 있음 
	//이 클래스로 인스턴스 만들때 해야하는 일 (생성자에 적힘)