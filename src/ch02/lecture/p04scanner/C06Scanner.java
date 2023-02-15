package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C06Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("시간을 입력하세요 : ");
		int hour = scanner.nextInt();
		System.out.println("분을 입력하세요 : ");
		int min = scanner.nextInt();
		
		System.out.println("요리에 걸리는 분을 입력하세요 : ");
		int cookMin = scanner.nextInt();
//		시간 분으로 환산 
		hour = hour * 60;
		if (hour >= 1380) {
		hour = 0;
		}
		if(hour == 0) {
			min = 0;
		}
				
		int currentHour = (hour + min + cookMin) / 60;
		int currentMin = (hour + min + cookMin) % 60;
		System.out.println(currentHour + " " + currentMin);
		
	}
}
