package ch03.lecture.p01larithmetic;

import java.util.Scanner;

public class C03Arithmetic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("첫번째 값을 입력하세요");
		String num1 = scanner.nextLine();
		System.out.println(num1);
		
		System.out.println("두번째 값을 입력하세요");
		String num2 = scanner.nextLine();
		System.out.println(num2);
		
		
		String[] number1; //입력된 값 숫자로 분해 
		number1 = num1.split("");
		String[] number2; //입력된 값 숫자로 분해 
		number2 = num2.split("");
		
		
		int[] new_number1 = new int[number1.length];	//새로운 배열에 int로 분해된 값 작성
		for(int i = 0; i < number2.length; i++) {
			new_number1[i] = Integer.parseInt(number1[i]);
		}
		
		int[] new_number2 = new int[number2.length];	//새로운 배열에 int로 분해된 값 작성
		for(int i = 0; i < number2.length; i++) {
			new_number2[i] = Integer.parseInt(number2[i]);
		}
			
		int first = ((new_number1[2] * new_number2[2]) + ((new_number1[1] * new_number2[2])*10) + ((new_number1[0] * new_number2[2])*100));
		System.out.println(first);
		int second = (((new_number1[2] * new_number2[1]) * 10) + ((new_number1[1] * new_number2[1])*100) + ((new_number1[0] * new_number2[1])*1000));
		System.out.println(second / 10);
		int third = (((new_number1[2] * new_number2[0]) *100) + ((new_number1[1] * new_number2[0])*1000) + ((new_number1[0] * new_number2[0])*10000));
		System.out.println(third / 100);
		int result = first + second + third;
		System.out.println(result);
		
				
	}
}
