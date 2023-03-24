package ch14.lecture.p01thread;

public class C06Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread6());
		t1.start();
		while(true) {
			System.out.println("@@MAIN THREAD@@");
		}
		
	}
}


class MyThread6 extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("@#작업쓰레드@#");
		}
	}
}