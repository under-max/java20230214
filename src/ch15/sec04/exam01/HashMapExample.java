package ch15.sec04.exam01;

import java.util.*;
import java.util.Map.*;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		//객체저장
		map.put("신용권", 85);
		map.put("홍길동", 90); //이거 짤리고 마지막 홍길동 정보 들어감 
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 entry 수" + map.size());
		System.out.println();
		
		//키로 값 얻기 
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println();
		
		//키 set 컬렉션을 얻고 반복해서 키와 값을 얻기 
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ": " + v);
		}
		System.out.println();
		
		//엔트리 Set 컬렉션을 얻고 반복해서 키와 값을 얻기 
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " " + v);
						
		}
		System.out.println();
		
		//키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 엔트리 수: " + map.size());
		System.out.println();


	}
}
