package ch04.lecture.p05break;

public class C02Break {
	//4x + 5y = 60
	//해가되는 x y 출력
	
	public static void main(String[] args) {
		outer: for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				int r = (4 + x) + (5 + y);
				if(r == 60) {
					break outer;
				}
			}
		}
		System.out.println("실행종료");
	}
}
