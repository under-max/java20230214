package ch14.lecture.p01thread;

public class C07Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				while(true) {
					System.out.println("##작업 쓰레드##");
				}
			}
		};
		
		t1.start();
		System.out.println("@@@@@@@main Thread@@@@@");
	}
}
