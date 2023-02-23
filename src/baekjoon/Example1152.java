package baekjoon;

import java.util.Scanner;

public class Example1152 {
	public static void main(String[] args) {
//		예제 입력 1 
//		The Curious Case of Benjamin Button
//		예제 출력 1 
//		6
//		예제 입력 2 
//		 The first character is a blank
//		예제 출력 2 
//		6
//		예제 입력 3 
//		The last character is a blank 
//		예제 출력 3 
//		6
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		String str3 = "";
		while (run) {
			System.out.println("문장을 입력하세요 종료를 원하시면 1을 입력하세요");
			String str1 = scanner.nextLine();

			String[] str2 = str1.split(" ");
			
			System.out.println(str2.length);
//			if (str1.charAt(0) == ' ') {
//				
//			} 
//			if (str1.charAt(str1.charAt(str1.length()) == ' ') {
//				
//			}
			
			if(str1.equals("1")) {
				run = false;
				System.out.println("프로그램을 종료합니다");
			}
		}
		
		scanner.close();
	}
}
