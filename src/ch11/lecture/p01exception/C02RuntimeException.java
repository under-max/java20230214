package ch11.lecture.p01exception;

public class C02RuntimeException {
	public static void main(String[] args) {
		int a = 0;
		int b = 3;
		
		try {
			int c = b /a;
			System.out.println("실행흐름 이어감");
			a = 1;
		} catch (Exception e) {
			System.out.println("나옴?");
		} finally {
			System.out.println("???");
		}
		
	}
}
