package datastructure.array.example;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("알파벳을 입력하세요 > ");
		String alpha = scanner.nextLine();
		String change = alpha.toUpperCase();
		System.out.println(change);
		
		
		
	}
}
