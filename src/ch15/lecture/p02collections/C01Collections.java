package ch15.lecture.p02collections;

import java.util.*;

public class C01Collections {
	public static void main(String[] args) {
		//수정불가 리스트
		List<String> list1 = List.of("java", "css", "spring", "jsp", "html");
		//수정가능 리스트로 다시 만듬 
		
		List<String> list2 = new ArrayList<>(list1);
		//sort
		Collections.sort(list2);
		System.out.println(list2);
		
		list2.forEach((m)->System.out.println(m));
		
		//max 
		String maxStr = Collections.max(list1);
		System.out.println(maxStr);
		
		//min 
		String minStr = Collections.min(list1);
		System.out.println(minStr);
		
		//revers 
		Collections.reverse(list2);
		System.out.println(list2);
		
		//fill 
		Collections.fill(list2, "web");
		System.out.println(list2);
		
		
	}
}
