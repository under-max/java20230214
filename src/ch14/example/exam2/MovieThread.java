package ch14.example.exam2;

public class MovieThread implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
