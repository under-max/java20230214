package ch15.lecture.p07treeset;

import java.util.*;

public class C02TreeSet {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();

		set.addAll(Set.of(3, 1, 20, 3000, 15, 7, 9, 2500, 100));
		System.out.println(set);
		
		//first 
		System.out.println("first");
		System.out.println(set.first());
		
		//last
		System.out.println("last");
		System.out.println(set.last());
		
		//higher
		System.out.println("higher");
		System.out.println(set.higher(50));
		
		//lower
		System.out.println("lower");
		System.out.println(set.lower(50));
		
		//floor
		System.out.println("floor"); //포함해서 같거나 작은거
		System.out.println(set.floor(50));
		System.out.println(set.floor(20));
		
		//ceiling
		System.out.println("filling"); //포함해서 같거나 큰가 
		System.out.println(set.ceiling(50));
		System.out.println(set.ceiling(100));
		
		//거꾸로 정렬된 NavigationSet 리턴
		NavigableSet<Integer> descendingSet = set.descendingSet();
		System.out.println(descendingSet);
	}
}
