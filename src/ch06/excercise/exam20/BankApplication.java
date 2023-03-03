package ch06.excercise.exam20;

import java.util.*;

public class BankApplication {
	public static void main(String[] args) {
		Account account = new Account();
		Scanner scanner = new Scanner(System.in);
		
		
		int accountNumCounter = 0;
		int accountNameCounter = 0;
		int accountBlaCounter = 0;
		
		String accountNum = "";
		String accountName = "";
		int accountBal = 0;

		boolean run = true;
		// 계좌번호로 비교
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택 > ");
			int check = Integer.parseInt(scanner.nextLine());
			
			if(check == 1) {
				System.out.println("---------------");
				System.out.println("계좌생성");
				System.out.println("---------------");
				System.out.print("계좌번호 : ");
				accountNum = scanner.nextLine();
				account.accountNumber[accountNumCounter] = accountNum;
				accountNumCounter += 1;	
				
				System.out.print("계좌주 : ");
				accountName = scanner.nextLine();
				account.name[accountNameCounter] = accountName; 
				accountNameCounter += 1;
				
				System.out.print("초기입금액 : ");
				accountBal = Integer.parseInt(scanner.nextLine());
				account.accountBalance[accountBlaCounter] = accountBal; 
				accountBlaCounter += 1;
				
				System.out.println("결과: 계좌가 생성되었습니다");
				
			} else if(check == 2) {
				System.out.println("---------------");
				System.out.println("계좌목록");
				System.out.println("---------------");
				
				for(int i = 0; i < account.accountNumber.length; i++) {
					if(account.accountNumber[i] != null) {
						System.out.print(account.accountNumber[i]+"   ");
						System.out.print(account.name[i] + "   ");
						System.out.print(account.accountBalance[i]);
						System.out.println();
					}
				}
				
			}else if(check == 3) {
				System.out.println("---------------");
				System.out.println("예금");
				System.out.println("---------------");
				System.out.print("계좌번호: ");
				accountNum = scanner.nextLine();
				System.out.print("입금액: ");
				accountBal = Integer.parseInt(scanner.nextLine());
				
				for(int i = 0; i < account.accountNumber.length; i++) {
					if(account.accountNumber[i] != null) {
						if(account.accountNumber[i].equals(accountNum)) {
							account.accountBalance[i] += accountBal;
						
						}
					}
				}
				
			}else if(check == 4) {
				System.out.println("---------------");
				System.out.println("출금");
				System.out.println("---------------");
				
				System.out.print("계좌번호 :");
				accountNum = scanner.nextLine();
				
				System.out.print("출금액: ");
				accountBal = Integer.parseInt(scanner.nextLine());
				
				for(int i = 0; i < account.accountNumber.length; i++) {
					if(account.accountNumber[i] != null) {
						if(account.accountNumber[i].equals(accountNum)) {
							account.accountBalance[i] -= accountBal;
						}
					}
				}
				
				System.out.println("결과 출금이 성공되었습니다");
				
				
			}else if(check == 5) {
				System.out.println("프로그램을 종료합니다");
				run = false;
			} else {
				System.out.println("정확한 값을 입력하세요");
			}
		}
		
		System.out.println("끗");
	}
}
