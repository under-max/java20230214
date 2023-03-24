package ch14.example.exam2;

public class MusicRunable extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("음악을 재생합니다");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
