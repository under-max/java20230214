package ch15.lecture.p01list;

import java.util.*;

public class C02List {
	public static void main(String[] args) {
		//list 전체탐색
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("css");
		list.add("html");
		list.add("spring");
		list.add("react");
		
		//for문 사용
		System.out.println("for###########");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//향상된 for문 사용 
		System.out.println("향상된 for ###########");
		for(String e: list) {
			System.out.println(e);
		}
		
		//Iterator
		System.out.println("Iterator %%%%%%%%%%%%%%");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//list 안에있는 foreach
		System.out.println("foreach 메소드 %%%%%%%%%%%%%%");
		list.forEach(e -> System.out.println(e));
		
		//forEach 메소드
		System.out.println("foreach 메소드######################");
		list.forEach(System.out::println);
		
	}
}
