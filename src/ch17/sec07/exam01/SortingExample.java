package ch17.sec07.exam01;

import java.util.*;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		student.add(new Student("홍길동", 30));
		student.add(new Student("신용권", 10));
		student.add(new Student("유미선", 20));
		
		
		//점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		
		student.stream()
		.sorted()
		.forEach(s->System.out.println(s.getName() + " : " + s.getScore()));
		
		System.out.println();
		
		//점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기 
		
		student.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s->System.out.println(s.getName() + " : " + s.getScore()));
	}
}
