package ch06.sec15;

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton(); private라 객체 접근 불가
//		Singleton obj2 = new Singleton();
		
		//정적메소드 호출 하여 싱글톤 객체 얻음
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체입니다");
		} else {
			System.out.println("다른 singleton 객체입니다");
		}
	}
}
