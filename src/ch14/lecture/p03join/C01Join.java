package ch14.lecture.p03join;

import javax.sql.rowset.*;

public class C01Join {
	public static void main(String[] args) {
		
		System.out.println("메인 쓰레드 시작 ");
		
		Thread t= new Thread(()->{
			System.out.println("쓰레드 시작 ");
			try {
				Thread.sleep(2000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("쓰레드 종료");
		});
		
		t.start();
		try {
			t.join(); //t쓰레드가 끝나길 기다린 후 진행
			
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		System.out.println("메인쓰레드 종료");
	}
}
