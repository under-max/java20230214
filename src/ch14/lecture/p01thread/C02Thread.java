package ch14.lecture.p01thread;

public class C02Thread {
	public static void main(String[] args) {
		Process01 p1 = new Process01();
		Thread t1 = new Thread(p1);
		t1.start(); // 적절한 순간에 Thread 가 Run 메소드 실행해줌 
		
	}
}

class Process01 implements Runnable {
	@Override
	public void run() {
		System.out.println("업무진행!!!");
	}
}
