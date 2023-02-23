package baekjoon;

import java.util.Scanner;

public class Example9086 {
	public static void main(String[] args) {
//		3 for문 몇번 돌릴지
//		     주어진 값		결과 
//		ACDKJFOWIEGHE       AE
//		O  					OO
//		AB					AB
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		int num = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < num; i++) {
			System.out.println("문자열을 입력하세요");
			String str = scanner.nextLine();
						
			char a = str.charAt(0);
			char b = str.charAt(str.length()-1);
			String str1 = String.valueOf(a) + String.valueOf(b);
			System.out.println(str1);
		}
		
		scanner.close();
		
	}
}
