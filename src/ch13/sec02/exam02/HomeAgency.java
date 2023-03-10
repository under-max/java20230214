package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home>{ //리턴타입 Home으로 대체 
	@Override
	public Home rent() {
		return new Home();
	}
}
