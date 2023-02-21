package ch04.lecture.p05break;

public class C04Continue {
	public static void main(String[] args) {
		for(int i = 0; i < 500; i++) {
			System.out.println("실행코드1");
			
			if(true) {
				continue; //하단에 있는 코드들 무시하고 다시 for 문 제일 위로 
			}
			
			System.out.println("실행코드 2");
		}
	}
}
