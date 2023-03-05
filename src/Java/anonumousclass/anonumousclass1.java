package Java.anonumousclass;

public class anonumousclass1 {
	public static void main(String[] args) {
		//익명클래스 
		//이름이 없는 클래스 
		//클래스 내부에서 정의하는 것중에 특별한 애들
		Coffee c1 = new Coffee();
		c1.order("아메리카노");
		System.out.println("--------------------");
		
		Coffee c2 = new Coffee();
		c2.order("라떼");
		System.out.println("--------------------");
		
		//굉장히 친한 친구 방문
		Coffee specialCOffee = new Coffee() { //이 객체 하나만을 위한 익명Class 원하는 동작 추가 가능 
			@Override
			public void order(String coffee) {
				super.order(coffee);
				System.out.println("(귓속말) 넣어둬 넣어둬");
								
			}
			@Override
			public void returnTray() {
				System.out.println("자리에 두면 내가 치움 ㅇㅇ"); //메소드의 동작을 새로 정의 
				
			}
		};
		
		specialCOffee.order("바닐라 라떼");
		specialCOffee.returnTray();
		
	}
}

class Coffee{
	public void order(String coffee) {
		System.out.println("주문하신 " + coffee + "나왔습니다");
	}
	
	public void returnTray() {
		System.out.println("커피반납이 완료되었습니다");
	}
}
