package ch15.lecture.p01list;

import java.util.*;

public class C01List {
	//java.utill.list 패키지에 있음
	//순서가 있는 collection 
	//각 아이템(element, 원소)는 index로 접근 가능
	
	public static void main(String[] args) {
		//새 리스트 만들기
		List<String> list = new ArrayList<>();
		//List<String> list = new ArrayList<String>();
		//var list = new ArrayList<String>();
		
		//element 추가 add
		list.add("Java");
		list.add("css");
		list.add("spring");
		list.add("Java");
		
		
		//element 얻기 get
		String e1 = list.get(0);
		String e2 = list.get(1);
		String e3 = list.get(2);
		String e4 = list.get(3);
		
		//list의 크기 size
		
		int a = list.size();
		System.out.println(a);
		
		//특정 index의 element 지우기
		list.remove(2);
		int a1 = list.size();
		String e5 = list.get(2);
		System.out.println("지운후 크기 " + a1);
		System.out.println("지운 후 2번 인데스" + e5);
		
		//특정 index의 값을 바꿈 
		list.set(2, "react");
		System.out.println(list.get(2));
	}
}
