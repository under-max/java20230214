package Java.array;

import java.util.*;

public class _04ArrayList {
	//컬렉션 프레임 워크 list set Map
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//데이터 추가
		list.add("유재석");
		list.add("조세호");
		list.add("김종국");
		list.add("박명수");
		list.add("강호동");
		
		// 데이터조회 (인덱스)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		System.out.println("----------------------");
		System.out.println(list.get(3));
		System.out.println(list.size());
		list.remove("박명수");
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println("---------------------");
		
		list.remove(3);
		System.out.println(list.get(list.size()-1));
		System.out.println(list.size());
		
		list.set(0, "이수근");
		System.out.println(list.get(0));
	}
}
