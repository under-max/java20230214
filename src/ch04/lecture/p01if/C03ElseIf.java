package ch04.lecture.p01if;

public class C03ElseIf {
	public static void main(String[] args) {
		//else if
		//위 if (else if) 의 조건이 false 이면 다른 조건 확인
		
		System.out.println("Code 1");
		
		if(true) {
			System.out.println("Code 2");
		} else if (false) {
			System.out.println("Code 3");
		} else if (false) {
			System.out.println("Code 4");
		} else if (false) {
			System.out.println("Code 5");
		} else {
			System.out.println("Code 6");
		}
		
		System.out.println("실행 이어감...");
		
		
	}
}
