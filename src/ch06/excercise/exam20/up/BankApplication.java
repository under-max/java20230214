package ch06.excercise.exam20.up;

import java.util.*;

public class BankApplication {
	public static void main(String[] args) {
		Account account = new Account();
		Scanner scanner = new Scanner(System.in);
		
		int counter = 0;
		
		String accountNum = "";
		String accountName = "";
		String accountBal = "";
		boolean run = true;
		
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택 > ");
			int check = Integer.parseInt(scanner.nextLine());
			
			if(check == 1) {
				System.out.println("---------------");
				System.out.println("계좌생성");
				System.out.println("---------------");

				System.out.print("계좌번호 : ");
				accountNum = account.validationAccountNumber();
				account.setBank(counter, accountNum);
				counter += 1;
								
				System.out.print("계좌주 : ");
				accountName = scanner.nextLine();
				account.setBank(counter, accountName);
				counter += 1;
				
				System.out.print("초기입금액 : ");
//				accountBal = scanner.nextLine();
				accountBal = account.validationAccountBalance();
				account.setBank(counter, accountBal);
				counter += 1;
				
				System.out.println("결과: 계좌가 생성되었습니다");
				
			} else if(check == 2) {
				System.out.println("--------------------------");
				System.out.println("계좌목록");
				System.out.println("--------------------------");
				account.listCheck();
				
				
			}else if(check == 3) {
				System.out.println("---------------");
				System.out.println("예금");
				System.out.println("---------------");
				System.out.print("계좌번호: ");
				accountNum = account.validationAccountNumber();
				System.out.print("입금액: ");
				accountBal = account.validationAccountBalance();
				account.deposit(accountNum, accountBal);
				
				
			}else if(check == 4) {
				System.out.println("---------------");
				System.out.println("출금");
				System.out.println("---------------");
				
				System.out.print("계좌번호 :");
				accountNum = account.validationAccountNumber();
				
				System.out.print("출금액: ");
				accountBal = account.validationAccountBalance();
				
				account.withdraw(accountNum, accountBal);
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
