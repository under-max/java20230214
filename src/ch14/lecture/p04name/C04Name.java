package ch14.lecture.p04name;

public class C04Name {
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			System.out.println(Thread.currentThread().getName());
		}, "작업쓰레드");
		
		t1.start();
	}
}
