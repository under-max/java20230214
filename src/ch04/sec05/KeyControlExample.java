package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true; 
		int speed = 0;
		
		while (run) {
			System.out.println("------------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------------");
			System.out.println("선택 : ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed += 5;
				System.out.println("현재속도는 " + speed  + "Km");
			} else if (strNum.equals("2")) {
				speed -= 5;
				System.out.println("현재속도는 " + speed + "Km");
			} else if (strNum.equals("3")) {
				run = false; 
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
