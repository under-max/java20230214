package ch15.example.leetcode.solution1748;

import java.util.*;

public class Check {
	public static void main(String[] args) {
Map<Integer, Integer> map = new HashMap<>();
		int[] nums = new int[] {1, 2, 3, 2};
		for(int a :  nums) {
			if(map.containsKey(a)) {
				int value = map.get(a);
				map.put(a, value + 1);
				System.out.println("value" + a);
				
			} else {
				map.put(a, 1);
				System.out.println("key" + a);
			}
		}
		int result = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			int value = entry.getValue();
			int key = entry.getKey();
			System.out.println("key : " +key + "value" + value);
			if(value == 1) {
				result += key;
				
			}
			
		}
		
		if (result != 0) {
			System.out.println(result);
		}
		
		
		System.out.println("Result = 0");
	}
}
