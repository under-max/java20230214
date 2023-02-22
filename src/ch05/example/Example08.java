package ch05.example;

import java.math.BigDecimal;

public class Example08 {
	public static void main(String[] args) {
		// 합과 평균 중첩 for
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};
		
		int totalStudent = 0;
		double totalSum = 0;
		
		for(int i = 0; i < array.length; i++) {
			totalStudent += array[i].length;
			for(int j = 0; j < array[i].length; j++) {
				totalSum += array[i][j];
			}
		}
		
		
		double avg = totalSum / totalStudent;
		System.out.println("학생 수: " + totalStudent);
		System.out.println("합: " + totalSum);
		System.out.println("평균: "+ avg);
	}
}
