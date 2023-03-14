package ch15.example.exam0620;

import java.util.*;

public class BankAccount {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		boolean run = true; 
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
				
		int length = 0;
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------------------");
			
			int check = Integer.parseInt(scanner.nextLine());
			System.out.println("선택>");
			System.out.println("----------------------------------------------");
			if(check == 1) {
				System.out.println("계좌생성");
				System.out.println("----------------------------------------------");
				
				Account account = new Account();
				
							
				System.out.print("계좌번호>");
				int acc = Integer.parseInt(scanner.nextLine());
				account.setAccount(acc);
				
				System.out.print("계좌주>");
				String accName = scanner.nextLine();
				account.setAccountName(accName);
				
				System.out.print("초기입금액>");
				int balance = Integer.parseInt(scanner.nextLine());
				account.setBalance(balance);
				
				list.add(account);
				
				if(!(list.isEmpty())) {
					System.out.println("결과: 계좌가 생성되었습니다.");
				}
				
			} else if(check == 2) {
				System.out.println("계좌목록");
				System.out.println("----------------------------------------------");
				
				for(int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i).getAccount() +"   " + list.get(i).getAccountName() + "   " + list.get(i).getBalance());
					System.out.println();
				}
				
				System.out.println();
			}else if(check == 3) {
				System.out.println("예금");
				System.out.println("------------------------------------");
				System.out.print("계좌번호> "); 
				int acc = Integer.parseInt(scanner.nextLine());
				System.out.print("예금액 > ");
				int balance = Integer.parseInt(scanner.nextLine());
				
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).getAccount() == acc) {
						list.get(i).setBalance(balance);
					}
				}
								
				
			} else if(check == 4) {
				System.out.println("------------------------------------");
				System.out.println("출금");
				System.out.println("------------------------------------");
				
				System.out.print("계좌번호> "); 
				int acc = Integer.parseInt(scanner.nextLine());
				System.out.print("예금액 > ");
				int balance = Integer.parseInt(scanner.nextLine());
				
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).getAccount() == acc) {
						int result = list.get(i).getBalance() - balance;
						list.get(i).setBalance(result);
						System.out.println("결과: 출금이 성공하였습니다.");
					}
				}
				
				
			} else if(check == 5) {
				run = false;
				System.out.println("프로그램 종료.");
			}
		}
		
		scanner.close();
	}
}
