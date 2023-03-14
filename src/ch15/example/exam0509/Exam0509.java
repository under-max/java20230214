package ch15.example.exam0509;

import java.util.*;

public class Exam0509 {
	public static void main(String[] args) {
		boolean run = true; 
		int avg = 0;
		int sum = 0;
		int max = 0;
		
		List<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
				
		while(true) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------------------------------");
			
			int check = Integer.parseInt(scanner.nextLine());
			if(check == 1) {
				System.out.println("선택1>");
				System.out.print("학생수>");
				avg = Integer.parseInt(scanner.nextLine());
				
			}else if(check == 2) {
				System.out.println("선택2>");
				for(int i = 0; i < avg; i++) {
					System.out.print("Score[" + i +"] :");
					list.add(Integer.parseInt(scanner.nextLine()));
				}
				
			} else if(check == 3) {
				System.out.println("선택3>");
				for(int i = 0; i < avg; i++) {
					System.out.println("Score[" + i +"] :" + list.get(i));
				}
			} else if(check == 4) {
				System.out.println("선택4");
				for(int a : list) {
					max = Math.max(max, a);
				}
				System.out.println("최고점수: " + max);
				for(int i = 0; i < list.size(); i++) {
					sum += list.get(i);
				}
				System.out.println("평균점수: " + (sum / avg));
			} else if(check == 5) {
				run = false;
				System.out.println("프로그램 종료.");
			}
			
			
			
		}
	}
}
