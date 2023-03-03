package ch06.excercise.exam18;

public class ShopService {

	private static ShopService ins = new ShopService(); //static method는 static 만 받을수 있으므로 private static 
	
	private ShopService() { //make a constructor 
		
	}
		
	public static ShopService getInstance() { //class 선언 없이 정적할당값 받을수 있는 정적메소드 선언 
		
		return ins;
	}

}
