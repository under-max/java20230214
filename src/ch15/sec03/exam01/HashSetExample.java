package ch15.sec03.exam01;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		//Hashset 컬랙션 생성
		Set<String> set = new HashSet<>();
		
		//객체저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); //중복객체라 저장하지 않음
		set.add("Spring");
		
		//저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
	}
}
