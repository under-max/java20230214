package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.returnOff();
		smartPhone.internetSearch();
		smartPhone.returnOn();
		
		Phone p = smartPhone;
		p.returnOn();
		p.returnOff();
//		p.internetSearch() 이건 안됨 
		
	}
}
