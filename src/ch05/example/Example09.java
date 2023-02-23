package ch05.example;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
//		학생들의 점수를 분석하는 프로그램 키보드로 학생수와 점수를 입력 받음 최고 점수 및 평균점수를 출력
//		1.학생수 2.점수입력 3.점수리스트 4.분석 . 5.종료
//		학생수> 
		
		int studentSum  = 0;
		int score = 0;
		int scoresSum = 0;
		int max = 0;
		int[] arra = {};
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			
			
			System.out.println("-------------------------------------------------------------------");
			System.out.println("1. 학생수 입력| 2.점수 입력 | 3. 점수 리스트 |4. 분석 | 5.종료");
			System.out.println("-------------------------------------------------------------------");
			
			int main = scanner.nextInt();
						
			if(main == 1) {
				System.out.print("학생수>");
				studentSum = scanner.nextInt();
				System.out.println("선택하신 학생수는 " + studentSum + "명 입니다.");
				arra = new int[studentSum];
			}else if(main == 2) {
				System.out.println("현재 학생수는 " + studentSum + "명 입니다 옳바르게 값을 입력해 주세요");
				
				for(int i = 0; i < studentSum; i++) {
					System.out.print((i+1)+"번째 학생 점수>");
					score = scanner.nextInt();
					arra[i] = score;
					scoresSum += score;
				}
				
				
			}else if(main == 3) {
				System.out.println("기록된 학생들의 점수리스트입니다.");
				for(int i = 0; i < arra.length; i++) {
					System.out.println((i+1) + "번째 학생의 점수: " + arra[i]);
				}
			}else if(main == 4) {
				System.out.println("학생들의 평균점수를 분석합니다");
				for(int i = 0; i < arra.length; i++) {
					if (max < arra[i]) {
						max = arra[i];
					}
				}
				System.out.println("최고 점수는 > " + max);
				System.out.println("학생들의 평균 점수는> " + ((double)scoresSum / studentSum) + "입니다");
			}else if(main == 5){
				System.out.println("프로그램을 종료합니다");
				run = false;
			}else {
				System.out.println("잘못된 키 입력입니다 1~5 사이의 숫자를 입력해 주세요");
			}
			
		}
		
		scanner.close();
		
	}
}
