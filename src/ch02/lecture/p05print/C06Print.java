package ch02.lecture.p05print;

import java.util.Scanner;

public class C06Print {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		int num6 = scanner.nextInt();
		
		int standard1 = 1; 
		int standard2 = 1; 
		int standard3 = 2; 
		int standard4 = 2; 
		int standard5 = 2; 
		int standard6 = 8;
		
		System.out.printf("%d\t", standard1 - num1);
		System.out.printf("%d\t", standard2 - num2);
		System.out.printf("%d\t", standard3 - num3);
		System.out.printf("%d\t", standard4 - num4);
		System.out.printf("%d\t", standard5 - num5);
		System.out.printf("%d\t", standard6 - num6);
		
		
		
	}
}
