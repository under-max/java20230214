package ch14.lecture.p01thread;

public class C03Thread {
	public static void main(String[] args) {
		Process03 p3 = new Process03();
		Thread t1 = new Thread(p3);
		t1.start();
		
		while(true) {
			System.out.println("@@@@@@@@@@@@@ main Thread @@@@@@@@@@@@");
		}
		
	}
}

class Process03 implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println("####쓰레드 실행중 ! #######");
		}
	}
}
