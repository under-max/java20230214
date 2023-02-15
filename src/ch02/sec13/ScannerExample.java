package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x 값 입력 : ");
		String strx = scanner.nextLine();
		int x = Integer.parseInt(strx);
		
		System.out.println("y 값 입력 : ");
		String stry = scanner.nextLine();
		int y = Integer.parseInt(stry);
		
		int result = x + y;
		System.out.println("x + y : "+ result);
		System.out.println();
		
		while(true) {
			System.out.println("입력 문자열");
			String data = scanner.nextLine();
			if(data.equals("q")){
				break;
			}
			System.out.println("출력 문자열 : " + data);
			System.out.println();
		}
		System.out.println("종료");
		scanner.close();
	}
}
