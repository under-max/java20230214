package datastructure.array.example;

import java.util.Iterator;
import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i =0; i < arr.length; i++) {
			
			System.out.println("5개의 양수를 입력하세요");
			int num = scanner.nextInt();
			
			sum += num;
		}
		
		System.out.println("5개의 양수의 합은 "+sum+"입니다");
	}
}
