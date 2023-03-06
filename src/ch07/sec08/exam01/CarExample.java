package ch07.sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//tire객체 장찾
		myCar.tire = new Tire();
		myCar.run();
		
		//HankookTire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		//kumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();
		
	}
}
