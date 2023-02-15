package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C05Scanner {
	public static void main(String[] args) {
		//백준? 1000번 
		String input = "1 2";
		Scanner scanner = new Scanner(System.in);
		
		//코드작성
		
//		System.out.println("첫번 째 수를 입력하세요 ");
		int num1 = scanner.nextInt();
//		System.out.println("두번 째 수를 입력하세요 ");
		int num2 = scanner.nextInt();
		
		int res = num1 + num2;
		System.out.println(res);
		
	
		
	}
}
