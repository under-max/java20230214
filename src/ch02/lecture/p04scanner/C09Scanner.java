package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C09Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//boolean, for문 몇번 돌릴껀지  
		boolean result = false; 
		int total = 0;
		System.out.println("영수증의 총액을 입력하세요 ");
		int bill = scanner.nextInt();
		if (bill > 1000000000) {
			System.out.println("잘못된 값입니다.");
		}
		
		
		int x = scanner.nextInt();
		if (x < 0 || x >= 100) {
			x = 0;
			System.out.println("범위는 1부터 100 사이로 넣어주세요 ");
		}
		for(int i = 0; i < x; i++) {
			int item = scanner.nextInt();
			int price = scanner.nextInt();
			int total1 = (item * price);
			total += total1;
		}
						
			
			
			
		if(bill==total){
		System.out.println("Yes");
		}else{
		System.out.println("No");
		}

    }
}
