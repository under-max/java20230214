package ch14.lecture.p02sleep;

public class C02Sleep {
	public static void main(String[] args) {
		
		System.out.println("메인쓰레드 시작");
		
		Thread t = new Thread(()->{
			System.out.println("쓰레드 시작");
			try {
				Thread.sleep(2000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("쓰레드 종료");
		});
		
		t.start();//분기점 제2쓰레드 시작 
		
		System.out.println("메인 쓰레드 종료");
		
		
	}
}
