package ch04.p03while;

public class C03DoWhile {
	public static void main(String[] args) {
		// do While
		// 코드블럭 실행 후 조건 확인
		// 조건이 true이면 코드블럭 실행 
		
		System.out.println("이전 명령문");
		boolean con = true;
		do {
			System.out.println("먕량믄 반복1");
			System.out.println("먕량믄 반복2");
		}while (con);
		
		System.out.println("다음 명령문");
	}
}
