package ch15.lecture.p03set;

import java.util.*;

public class C01Set {
	public static void main(String[] args) {
		//set : 순서없음 중복저장 안됨 
		Set<Integer> set = new HashSet<>();
		
		//add element 
		
		set.add(30);
		set.add(90);
		set.add(3);
		set.add(7);
		set.add(90);
		
		
		System.out.println(set);
		
		//size 크기 
		int size = set.size();
		System.out.println(size);
		
		//remove
		
		set.remove(3);
		System.out.println(set.size());
		System.out.println(set);
		
		//전체 탐색
		System.out.println("향상된 for문");
		for(Integer b: set) {
			System.out.println(b);
		}
		//고전적 for문은 index없기 떄문에 안됨 
		
		System.out.println("Iterator %%%%%%%%%%%");
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("foreach###########");
		set.forEach((e)->System.out.println(e));
		
		set.forEach(System.out::println);
		
		
		
	}
}


