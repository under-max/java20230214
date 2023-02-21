package ch04.example;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		//while 문과 scanner 조합 키보드로 부터 입력된 예금 출금 조회 종료 기능을 제공하는 코드 
		//예금 출금 잔고 종료
		//4번 누르면 프로그램 종료
		
		Scanner scanner = new Scanner(System.in);
		
		int balance = 0;
		boolean run = true;
		
		while (run) {
			
			System.out.println("---------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------------");
			
			String str = scanner.nextLine();
			if(str.equals("1")) {
				System.out.printf("입금하실 금액을 입력해 주세요 :");
				int money = Integer.parseInt(scanner.nextLine());
				System.out.println(money + "원을 예금하였습니다");
				balance += money;
			}else if(str.equals("2")) {
				System.out.printf("출금하실 금액을 입력해 주세요 :");
				int money = Integer.parseInt(scanner.nextLine());
				System.out.println(money + "원을 출금 하였습니다");
				balance -= money;
			} else if(str.equals("3")) {
				System.out.println(balance + "원만큼의 금액이 남아있습니다");
			} else if(str.equals("4")) {
				System.out.println("프로그램을 종료합니다");
				run = false;
			}
			
			
		}
			
	}
}
