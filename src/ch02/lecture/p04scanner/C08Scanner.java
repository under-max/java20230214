package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C08Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("반복문 몇번 진행할 껀가요? : ");
		int x = scanner.nextInt(); //반복문 몇번 반복 할껀지 
		for(int i = 0; i < x; i++) {
		System.out.println("첫번째 수를 입력하세요 : ");
		int num1 = scanner.nextInt();
		System.out.println("두번째 수를 입력하세요 : ");
		int num2 = scanner.nextInt();
		int result = num1 + num2;
		System.out.println(result);
		}
	}
}
