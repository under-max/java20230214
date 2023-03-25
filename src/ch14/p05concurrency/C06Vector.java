package ch14.p05concurrency;

import java.util.*;

public class C06Vector {
	static List<Integer> list = new Vector<>();
	public static void main(String[] args) {
		//arrayList 랑 같지만 멀티스레드 구현시 
		Thread a = new Thread(()->{
			for(int i = 0; i < 10000; i++) {
				list.add(9);
				list.remove(0);
			}
		});
		
		Thread b = new Thread(()->{
			for(int i = 0; i < 10000; i++) {
				list.add(9);
				list.remove(0);
			}
		});
		
		a.start(); b.start();
		try {
			a.join();
			b.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("종료!");
	}
}
