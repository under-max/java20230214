package ch15.example.exam09;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		int[] a = {1,2,3};
		List<int[]> list = Arrays.asList(a);
		System.out.println(list);
		Collections.sort(list);
		
		
		
		
		String name = null; //최고점수를 받은 아이디를 저장하는 변수
		int maxScore = 0; //최고점수를 저장하는 변수
		int totalScore = 0; //점수 합계를 저장하는 변수
		
		
		//출력
		//평균점수 : 91
		//최고점수 : 96
		//최고점수받은 아이디 : blue
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			if(maxScore < v) {
				maxScore = v;
				name = k;
			}
			
			totalScore += v;
			
		}
		System.out.println("평균점수 : " + (totalScore / map.size()));
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수 받은 아이디 : " + name);
		
		
		
		
	}
}
