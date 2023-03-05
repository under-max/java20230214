package Java.anonumousclass;

public class anonumousclass2 {
	public static void main(String[] args) {
		HomeMadeBurger momMadeBurger = getMoMadeBurger(); //오버라이딩한 추상클래스의 메소드 소환! 추상메서드 즉석에서 구현하면서 놀기가능
		
		momMadeBurger.cook();
		System.out.println("----------------------");
		
		HomeMadeBurger broMadeBurger = getBroMadeBurger(); 
		
		broMadeBurger.cook();
	}		
	
	
	public static HomeMadeBurger getBroMadeBurger() {
		return  new HomeMadeBurger() {
			
			@Override
			public void cook() {
				System.out.println("집에서 만드는 동생표 수제버거");
				System.out.println("재료: 빵, 소고기패티, 양상추, 피클, 쨈");
				
			}
		};
	}
	
	
	public static HomeMadeBurger getMoMadeBurger() {
		return new HomeMadeBurger() {
			@Override
			public void cook() {
				System.out.println("집에서 만드는 엄마표 수제버거");
				System.out.println("재료: 빵, 소고기패티, 해쉬브라운, 양상추, 마요네즈, 피클, 케찹");
				
			}
		};
	}
	
}

abstract class HomeMadeBurger {
	public abstract void cook();
}
