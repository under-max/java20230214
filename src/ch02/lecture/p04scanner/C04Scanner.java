package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C04Scanner {
	public static void main(String[] args) {
		String input = "3 33 555 55";
		Scanner scanner = new Scanner(input);
		
		int i1 = scanner.nextInt();
		System.out.println(i1);
		int i2 = scanner.nextInt();
		System.out.println(i2);
		int i3 = scanner.nextInt();
		System.out.println(i3);
		int i4 = scanner.nextInt();
		System.out.println(i4);
		
		System.out.println(i1 + i2);
		scanner.close();
	}
}
