package ch15.sec05.exam03;

import java.util.*;

public class ComparableExample {
	public static void main(String[] args) {
		//TreeSet컬렉션 생성
//		TreeSet<Person> treeSet = new TreeSet<>();
		TreeSet<Person> treeSet = new TreeSet<>((o1, o2) -> o1.age-o2.age);
		
		//객체저장
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		//객체를 하나씩 가져오기 
		
		for(Person person : treeSet) {
			System.out.println(person.name + " : " + person.age);
		}
	}
}
