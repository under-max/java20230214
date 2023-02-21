package ch04.example;

import java.util.Iterator;

public class Example05 {
	public static void main(String[] args) {
		//중첩 for 문 이용 4x + 5y = 60 의 모든해를 구해서 x= y= 형태로 출력하는 코드
		
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if((4*x) + (5*y) == 60) {
					System.out.println("x = " + x + " y = " + y);
				}
			}
		} 
	}
}
