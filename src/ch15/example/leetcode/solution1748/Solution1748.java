package ch15.example.leetcode.solution1748;

import java.util.*;

public class Solution1748 {
	public int sumOfUnique(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int a :  nums) {
			if(map.containsKey(a)) {
				int value = map.get(a);
				map.put(a, value + 1);
				
			} else {
				map.put(a, 1);
			}
		}
		int result = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			int value = entry.getValue();
			int key = entry.getKey();
			if(value == 1) {
				result += key;
			}
			
		}
		
		if (result != 0) {
			return result;
		}
		
		
		return 0;
	}
}





