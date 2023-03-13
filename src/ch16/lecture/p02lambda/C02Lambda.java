package ch16.lecture.p02lambda;

public class C02Lambda {
	public static void main(String[] args) {
		//파라미터가 없으면 빈 () 
		//메소드 body는 {}
		MyInterface02 o1 = ()-> System.out.println("재정의!");
		o1.method();
		
		
		//메소드 명령문이 하나이면 중괄호 생략가능
		
		MyInterface02 o2 = ()->{
			System.out.println("명령문 여러개1");
			System.out.println("명령문 여러개2");
		};
		
		//생략가능하면 생략!
		//lambda는 생략할 수록 읽기 쉬움
		MyInterface02 o3 = () -> System.out.println("명령문 한개!");
		
		o2.method();
		System.out.println("---------------");
		o3.method();
		
	}
}

@FunctionalInterface
interface MyInterface02 {
	//파라미터가 없는 추상 메소드 
	
	public void method();
}
