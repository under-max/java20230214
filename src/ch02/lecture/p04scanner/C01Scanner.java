package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C01Scanner {
	public static void main(String[] args) {
//		scanner로 키보드로 입력받은 내용을 프로그램으로 가져올 수 있다
//		Scanner scanner = new Scanner(System.in);
		
		//String 도 가능 
		String input1 = """
				동해물과 백두산이 
				마르고 닳도록 
				하느님이 보우하사
				우리나라 만세
				""";
		Scanner scanner = new Scanner(input1);
		
		String line1 = scanner.nextLine();
		System.out.println(line1);
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
//		System.out.println(scanner.nextLine()); error Exception in thread "main" java.util.NoSuchElementException: No line found
		
		System.out.println("##########################");
		scanner.close();
		
	}
}
