package ch07.sec10.exam01;

public abstract class Phone {
	String owner;
	
	Phone(String owner){
		this.owner = owner;
	}
	
	void returnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	
	void returnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
