package ch06.sec10.exam03;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed+"으로 달립니다.");
	}
	
	static void simulate(){
		Car myCar = new Car();
		
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		
		int n = 144;
		int a = 0;
		 for(int i = 1; i < n; i++){
	            if(i*i == n){
	                a = 1;
	                break;
	            }
	            a = 2;
	        }
		 System.out.println(a);
	}
}
