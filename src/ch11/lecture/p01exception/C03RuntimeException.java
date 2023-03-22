package ch11.lecture.p01exception;

public class C03RuntimeException {
	public static void main(String[] args) {
		String a = null;
		try {
			System.out.println(a.length());
		} catch (Exception e) {
			System.out.println("ㅇㅇ?");
		}
		
		
		System.out.println("Continue");
	}
}
