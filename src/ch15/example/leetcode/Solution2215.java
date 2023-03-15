package ch15.example.leetcode;

import java.util.*;

public class Solution2215 {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2){
				
			Set<Integer> arr1 = new HashSet<>();
			Set<Integer> arr2 = new HashSet<>();
			
			for(int i = 0; i < nums1.length; i++) {
				arr1.add(nums1[i]);
			}
			
			for(int i = 0; i < nums2.length; i++) {
				arr2.add(nums2[i]);
			}
			
			List<Integer> list1 = new ArrayList<>();
			List<Integer> list2 = new ArrayList<>();
			
			list1.addAll(arr1);
			list2.addAll(arr2);
			
			list1.removeIf(e->arr2.contains(e));
			list2.removeIf(e->arr1.contains(e));
			
			return List.of(list1, list2);
//			arr.stream().filter(arr.get(0).)
	
	}
}



