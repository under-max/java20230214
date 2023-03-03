package in28minutes.chap09.coffee;

import in28minutes.chap09.user.*;

public class CoffeeByUser <T extends User>{ 
	
	public T user;
	
	public CoffeeByUser(T user){
		this.user = user;
	}
	
	public void ready() {
		System.out.println("커피 준비 완료 : " + user.name);
		user.addPoint();
	}
}
