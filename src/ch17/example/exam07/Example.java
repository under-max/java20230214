package ch17.example.exam07;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));
		
		List<Member> developerPerson = new ArrayList<>();
				
		//고전 ->개발자인 사람만 별도의 리스트에 
		
		for(Member de : list) {
			if(de.getJob().equals("개발자")) {
				developerPerson.add(new Member(de.getName(), de.getJob()));
			}
		}
		
		for(Member de : developerPerson) {
			System.out.println(de.getName() + " : " + de.getJob());
		}
		
//		stream 
		List<Member> developers = list.stream()
		.filter(d -> d.getJob().contains("개발자"))
		.collect(Collectors.toList());
		
		developers.stream()
		.forEach(d->System.out.println(d.getName()));
				
		
		String a = "abcabcadc";
		
		
//		for(String n : b) {
//			System.out.println(n);
//		}
//		

		Arrays.stream(a.split("")).map(e-> a.contains(e) ? "" : e).forEach(System.out::println);
//		System.out.println();
//		Arrays.stream(a.split("")).filter(e -> b.equals(e)).forEach(System.out::println);
		
	}
}
