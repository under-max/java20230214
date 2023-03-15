package ch15.lecture.p04map;

import java.util.*;

public class C01Map {
	public static void main(String[] args) {
		//map
		//(key, value) 쌍 entry 를 저장
		//key는 중복되지 않음 
		
		Map<String, String> map = new HashMap<>();
		map.put("Kang", "Slamdunk");
		map.put("serly", "avatar");
		map.put("maverick", "topgun");
		
		//엔트리 갯수
		int a = map.size();
		System.out.println(a);
		
		map.put("Kang", "baseball");
		
		//key로 value 얻기
				
		String v1 = map.get("serly");
		String v2 = map.get("Kang");
		String v3 = map.get("maverick");
		
		System.out.println(v1 +" " + v2 + " " + v3);
		
		//entry 지우기 
		map.remove("Kang");
		System.out.println(map.size());
		
		//전체탐색 
		
		System.out.println("keyset 사용 #######");
		Set<String> keys = map.keySet();
		System.out.println(keys);
				
		for(String key: keys) {
			System.out.println(key);
		}
		
		System.out.println("foreach 메소드 $$$$$$$$$$$$$$$$$$");
		
		map.forEach((k,v)-> System.out.println(k +" " + v));
		
		System.out.println("EntrySet 메소드 ###################");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " + " + entry.getValue());
		}
		
	}
}
