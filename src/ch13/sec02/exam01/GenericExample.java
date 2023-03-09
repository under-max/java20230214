package ch13.sec02.exam01;

public class GenericExample {
	public static void main(String[] args) {
		//k는 tv로 댜체 m 은 string으로 대체
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		
		//getter 리턴값은 tv와 string이 됨
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println("---------------------");
		Product<Car, String> product2 = new Product<>();
		
		//setter 매개값은 반드시 Car와 String을 제공 
		
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
		
		//Getter 리턴값은 Car와 String이됨 
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}
