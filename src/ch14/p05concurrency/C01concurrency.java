package ch14.p05concurrency;

public class C01concurrency {
	static int field = 0;
	
	public static void main(String[] args) {
		Thread a = new Thread(()->{
			for(int i = 0; i < 100000; i++) {
				field++;
			}
		}, "A Thread");
		
		Thread b = new Thread(()->{
			for(int i = 0; i < 100000; i++) {
				field++;
			}
		}, "B Thread");
		
		a.start();
		b.start();
		
		try {
			a.join();
			b.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//여러쓰레드가
		//하나의 객체 상태를 변경하려고 할떄
		//매우 주의해서 코드를 작성해야 함 
		
		//해결책1: 여러 쓰레드가 하나의 객체 상태를 변경하는 코드를 작성하지 않는다 
	
		
		System.out.println(field);
		
	}
}
