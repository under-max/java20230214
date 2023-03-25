package ch14.p05concurrency;

public class C02Concurrency {
	static int field = 0;
	public static void main(String[] args) {
		//synchronized 블럭(동기화블럭)
		
		Object o = new Object(); //syncronized 에서 사용하는 객체 monitor lock, monitor, lock
		Thread a = new Thread(()->{
			for(int i = 0; i < 100000; i++) {
				synchronized(o) { //parameter 하나가 진행되면 다른 하나는 진행 못함 
					field++;	
					System.out.println(field + "A");				//공통으로 하나 획득할수 있는 객체
				}											//블럭 실행할때 Object o 를 획득해야 진행할 수 있음 
			}												//먼저 획득한 블럭이 완료하면 object를 반납함 
		});													//획득 실행 반납의 순 
		Thread b = new Thread(()->{
			for(int i = 0; i < 100000; i++) {
				synchronized (o) { //parameter 
					field++;
					System.out.println(field + "B");
				}
			}
		});
		
		a.start();
		b.start();
		try {
			a.join();
			b.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(field);
	}
}
