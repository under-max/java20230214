package ch17.example.exam06;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("김자바", 26)
				);
		
		//list 에 저장되어있는 Member의 평균나이 출력
		
		//고전적인 방법
		int sum = 0;
		for(Member a : list) {
			sum += a.getAge();
		}
		double avg1 = (double)sum / (list.size());
		System.out.println("평균나이 : " + avg1);
	
		//stream 이용
		double avg2 = list.stream()
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		System.out.println("평균나이 : " + avg2);
		
		double avg3 = list.stream()
				.collect(Collectors.averagingDouble(Member::getAge))
				.doubleValue();
		
		
		
		list.stream()
		.mapToInt(Member::getAge)
		.average().stream()
		.forEach(s->System.out.println("평균나이 : " + s));
		
	}
}
