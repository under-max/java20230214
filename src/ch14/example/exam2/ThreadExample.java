package ch14.example.exam2;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new MovieThread());
		thread1.start();
		
		Thread thread2 = new MusicRunable();
		thread2.start();
		
		for(int i = 0; i < 3; i++) {
			System.out.println("메인메소드를 시작합니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
