package Java.array;

import java.util.*;

public class _07HashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> list = new HashMap<>();
		
		//데이터 추가 
		
		list.put("유재석", 100);
		list.put("박명수", 50);
		list.put("김희철", 30);
		list.put("김종국", 150);
		
		for(String a : list.keySet()) {
			System.out.println(a);
		}
	}
}
