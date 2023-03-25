package ch14.p05concurrency;

import java.util.concurrent.atomic.*;

public class C04ThreadSafe {
	static int field = 0;
	static AtomicInteger atomicInteger = new AtomicInteger();
	
	public static void main(String[] args) {
		Thread a = new Thread(()->{
			for(int i = 0; i < 100000; i++) {
				field++;
				atomicInteger.getAndIncrement();
			}
		});
		
		Thread b = new Thread(()->{
			for(int i = 0; i < 100000; i++) {
				field++;
				atomicInteger.getAndIncrement();
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
		System.out.println(atomicInteger.get());
	}
}
