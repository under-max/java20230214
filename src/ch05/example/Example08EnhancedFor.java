package ch05.example;

public class Example08EnhancedFor {
	public static void main(String[] args) {
		// 주어진 배열 항목에서 전체 합과 평균
		int[][] arry = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};
		int sum = 0;
		int totalStudent = 0;
		double avg = 0;
		
		for(int[] first : arry) {
			for(int second : first) {
				sum += second;
				totalStudent++;
			
			}
		}
		
		avg = (double)sum / totalStudent;
		System.out.println("전체 합 : " + sum);
		System.out.println("전체 학생 수: " + totalStudent);
		System.out.println("평균 : "+ avg);
		
	}
}
