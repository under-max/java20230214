package ch04.lecture.p02switch;

public class C04Switch {
	public static void main(String[] args) {
		//switch labeled statement 
		// break 없이 코드 블럭 작성 가능
		
		int val = 4;
		
		switch (val) {
		case 1:
			System.out.println("code 1");
			break;
		case 2:
			System.out.println("code 2");
			break;
		case 3, 4:
			System.out.println("code 3, 4");
			break;
		default:
			System.out.println("default code");
			break;
		}
		
		switch (val) { //break 문 없이도 가능, 중가로 생략 가능 
			case 1 -> System.out.println("code 1");
			case 2 -> System.out.println("code 2");
			case 3, 4 -> System.out.println("code 3, 4");
			default -> System.out.println("default code");
		
		}
	}
}
