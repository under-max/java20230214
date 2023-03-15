package ch15.sec03.exam03;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 컬랙션 생성
		Set<String> set = new HashSet<String>();
		
		//객체추가 
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Jpring");
		
		//객체를 하나씩 가져와서 처리
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			if(element.equals("JSP")) {
				iterator.remove();
			}
		}
		String a = "aa";
		a.equals(a);
		System.out.println();
		
		//객체제거 
		set.remove("JDBC");
		
		//객체를 하나씩 가져와서 처리 
		for(String element: set) {
			System.out.println(element);
		}
		
		
		
	}
}
