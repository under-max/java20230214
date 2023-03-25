package ch14.lecture.p02sleep;

public class C01Sleep {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작");
		
		try {
			Thread.sleep(2000);//2초동안 휴식
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("메인스레드 종료");
	}
}
