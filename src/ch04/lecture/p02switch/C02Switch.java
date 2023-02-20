package ch04.lecture.p02switch;

public class C02Switch {
	public static void main(String[] args) {
		//break
		//switch 내 실행 흐름 종료
		//break 없으면 그 뒤로 쭉나옴 
		
		int val = 1;
		
		switch (val) {
		case 1:
			System.out.println("code1");
			break;
		case 2:
			System.out.println("code2");
			break;
		case 3:
			System.out.println("code3");
			break;
		default:
			System.out.println("code4");
			break;
		}
	}
}
