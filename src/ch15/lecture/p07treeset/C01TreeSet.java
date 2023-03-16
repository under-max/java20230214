package ch15.lecture.p07treeset;

import java.util.*;

public class C01TreeSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> treeSet = new TreeSet<>();
		
		set.add(3000);
		treeSet.add(3000);
		set.add(20);
		treeSet.add(20);
		set.add(20000);
		treeSet.add(20000);
		
		System.out.println(set);
		System.out.println(treeSet);
		
		Set<String> treeset2 = new TreeSet<>();
		treeset2.add("b");
		treeset2.add("d");
		treeset2.add("e");
		treeset2.add("c");
		treeset2.add("i");
		System.out.println(treeset2);
		
		set.add(20);
		treeSet.add(20);
		System.out.println(set);
		System.out.println(treeSet);
	}
}
