package ch02.lecture.p05print;

import java.util.Scanner;

public class C08Print {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("루프 수를 입력하세요");
		
		int loop = scanner.nextInt();
		
		for(int i = 0; i < loop; i++) {
			System.out.println("A와 B의 값을 입력하세요 범위는 1부터 10 사이의 수 입니다");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			System.out.printf("Case #%2$d: %1$d%n",num1 + num2, i + 1);
		}
		
		
	}
}
