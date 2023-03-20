package ch17.sec07.exam02;

import java.util.*;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("신용권", 10));
		studentList.add(new Student("유미선", 20));
		
		
		//점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기

		studentList.stream()
		.sorted((o1, o2) -> Integer.compare(o1.getScore(), o2.getScore()))
		.forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
		
		studentList.stream()
		.sorted((o1, o2) -> o1.getScore() - o2.getScore())
		.forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
		
		//점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기

		studentList.stream()
		.sorted((o1, o2) -> Integer.compare(o2.getScore(), o1.getScore()))
		.forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
		
	}
}
