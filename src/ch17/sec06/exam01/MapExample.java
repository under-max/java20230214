package ch17.sec06.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		//Student를 score 스트림으로 변환
		
		studentList.stream()
		.mapToInt(s->s.getScore())
		.forEach(System.out::println);
		
		//최대점수
		System.out.println("최대점수");
		studentList.stream()
		.mapToInt(Student::getScore)
		.max()
		.stream()
		.forEach(System.out::println);
		
		
		int[] a = {1,2,3};
		
		
		
		//최소점수
		System.out.println("최소점수");
		studentList.stream()
		.mapToInt(Student::getScore)
		.min()
		.stream()
		.forEach(System.out::println);
		//합
		System.out.println("합");
		int b = studentList.stream()
				.mapToInt(Student::getScore)
				.sum();
		
		System.out.println(b);
		//평균
		System.out.println("평균");
		studentList.stream()
		.mapToInt(Student::getScore)
		.average()
		.stream()
		.forEach(System.out::println);
		
		//통계
		System.out.println("통계");
		IntSummaryStatistics summary = studentList.stream()
		.mapToInt(Student::getScore)
		.summaryStatistics();
		
		System.out.println(summary);
	}
}
