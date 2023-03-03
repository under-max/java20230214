package ch06.excercise.exam20.up;

import java.util.*;

public class Account {
	private String[] bank = new String[100];
	private int length = bank.length;
	
	Scanner scanner = new Scanner(System.in);
	private String accountNumber;
	private String accountBalance;

//	public String[] getBank() {
//		return bank;
//	}
//
//	public void setBank(String[] bank) {
//		this.bank = bank;
//	}

	public int getLength() { //100크기의 bank array의 길이 접근용 메소드
		return length;
	}

	public String getBank(int x) {
		
		return bank[x];
	}

	public void setBank(int x, String desc) {
	 
		bank[x] = desc;
	}
	
		
	public String Sum (int x, int bal) {
		bank[x] =  "" + (Integer.parseInt(bank[x]) + bal);
		return bank[x];
	}
	
	public String minus(int x, int bal) {
		bank[x] =  "" + (Integer.parseInt(bank[x]) - bal);
		return bank[x];
	}
	
	public void listCheck() { //계좌목록 확인 메소드
		for(int i = 0; i < getLength(); i++) {
			int x = 2;
			if(getBank(i) != null) {
				System.out.print(getBank(i)+"   ");
							
			}

			if(getBank(i) != null) {
				if(i == 2) {
					System.out.println();
				}else if(!(i == 0) && i == x + 3) {
					System.out.println();
					x += 3;
				}
			}
		}
	}
	
	public void deposit(String accountNum, String accountBal) { //입금 메소드
		for(int i = 0; i < getLength(); i++) {
			
			if(getBank(i) != null) {
				if(getBank(i).equals(accountNum)) {
					Sum((i+2), Integer.parseInt(accountBal));
											
				}
			}
			
		}
	}
	
	public void withdraw(String accountNum, String accountBal) { //출금 메소드
		for(int i = 0; i < getLength(); i++) {
			if(getBank(i) != null) {
				if(getBank(i).equals(accountNum)) {
					minus(i+2, Integer.parseInt(accountBal));
				}
			}
		}
	}
	
	public String validationAccountNumber() { //계좌번호 입력 유효성 검사
		while(true) {
			accountNumber = scanner.nextLine();
			if(!(accountNumber.matches("[1-9]{3}-{1}[1-9]{3}"))) {
				System.out.print("잘못된 입력 값 입니다. 다시 입력하세요 >");
			}else {return accountNumber;}
		}
	}
	
	public String validationAccountBalance() { //금액입력 유효성 검사
		while(true) {
			accountBalance = scanner.nextLine();
			if(!(accountBalance.matches("[0-9]*"))) {
				System.out.print("잘못된 입력 값 입니다. 다시 입력하세요 >");
			} else {return accountBalance;}
			
		}
		
	}
	
}
