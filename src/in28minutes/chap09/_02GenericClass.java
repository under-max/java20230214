package in28minutes.chap09;

import in28minutes.chap09.coffee.*;
import in28minutes.chap09.user.*;

public class _02GenericClass {
	public static void main(String[] args) {
		//제네릭 클래스 
		CoffeeByNumber c1 = new CoffeeByNumber(33);
		c1.ready();
		
		CoffeeByNickname c2 = new CoffeeByNickname("유재석");
		c2.ready();
		
		System.out.println("----------------");
		
		CoffeeByName c3 = new CoffeeByName(34);
		c3.ready();
		
		CoffeeByName c4 = new CoffeeByName("박명수");
		c4.ready();
		
		System.out.println("----------------");
		int c3Name = (int)c3.name;
		System.out.println("주문 고객 번호 : " + c3Name);
		
		String c4Name = (String)c4.name;
		System.out.println("주문 고객 이름 : " + c4Name);
		
		System.out.println("----------------");
		
		Coffee<Integer> c5 = new Coffee<>(32);
		Coffee<String> c6 = new Coffee<>("Rick");
		Coffee<Double> c7 = new Coffee<>(25.00);
		
		c5.ready();
		int c5Name = c5.name;
		System.out.println(c5Name);
		c6.ready();
		String c6Name = c6.name;
		System.out.println(c6Name);
		c7.ready();
		double c7Name = c7.name;
		System.out.println(c7Name);
		
		CoffeeByUser<User> c8 = new CoffeeByUser<>(new User ("강호동"));
		c8.ready();
		
		CoffeeByUser<User> c9 = new CoffeeByUser<User>(new VipUser("서장훈"));
		c9.ready();
		
		System.out.println("---------------------------");
		
		orderCoffee("김영철");
		orderCoffee(36);
		orderCoffee("김희철", "아메리카노");
		orderCoffee(37, "라떼");
		
		
		VipUser o1 = new VipUser("인간");
		o1.addPoint();
	}
	
	public static <T> void orderCoffee(T name) {
		System.out.println("커피 준비 완료 : " + name);
	}
	
	public static <T, V> void orderCoffee(T name, V coffee) {
		System.out.println(coffee + " 커피 준비 완료 : " + name);
	}
}
