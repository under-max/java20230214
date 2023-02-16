package ch02.lecture.p05print;

import java.util.Scanner;

public class C05Print {
	public static void main(String[] args) {
		//첫번쨰 수 스캐너로 받아서 
		Scanner scanner = new Scanner(System.in);
		System.out.printf("첫번째 수\n");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째 수\n");
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
		scanner.close();
	}
}
