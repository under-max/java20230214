package Java.array;

import java.util.*;

public class _06HashSet {
	public static void main(String[] args) {
		//세트 -> 중복을 허용하지 않음
		HashSet<String> list = new HashSet<>(); //HashSet은 순서보장 중복 허용하지 않음
		
		list.add("삼겹살");
		list.add("쌈장");
		list.add("소금");
		list.add("후추");
		list.add("삼겹살");
		list.add("깻잎");
		list.add("상추");
		list.add("삼겹살");
		list.add("상추");
		
		for(String a : list) {
			System.out.println(a);
		}
		
		
	}
}
