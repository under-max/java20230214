package in28minutes.chap09.coffee;

public class CoffeeByNickname {
	public String byNickName;

	public CoffeeByNickname(String byNickName) {
		
		this.byNickName = byNickName;
	}
	
	public void ready() {
		System.out.println("커피 준비 완료 : " + byNickName);
	}
}
