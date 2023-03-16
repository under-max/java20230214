package ch15.sec08;

import java.util.*;

public class ImmutableExample {
	public static void main(String[] args) {
		//List불변컬렉션 생성
		List<String> immutableList1 = List.of("A", "B", "C");
//		immutableList1.add("D"); xxxx
		
		//set불변 컬렉션 생성 
		Set<String> immutableSet1 = Set.of("A", "B", "C");
//		immutableSet1.add("A") xxx
		
		//Map 불변 컬렉션 생성
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A", 
				2, "B", 
				3, "C"
				);
		
		//immutableMap1.put(4,"D")//x
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		
		//수정가능한 리스트로 만들기 
		List<String> list2 = new ArrayList<>(immutableList2);
		//->list2 는 수정가능한 리스트
		
		
		//Set 컬렉션을 불변 컬렉션으로 복사 
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immitableSet2 = Set.copyOf(set);
		
		//Set 컬렉션을 수정 가능한 컬렉션으로 변경 
		Set<String> set2 = new HashSet<>(immitableSet2);
		//set2 는 변경 가능한 set
		
		//Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		
		//Map 컬렉션을 수정 가능한 컬렉션으로 변경 
		Map<Integer,String> map2 = new HashMap<>(immutableMap2);
		
		
		//배열로 부터 List 불변 컬렉션 생성
		String[] arr = {"A", "B", "C"};
		List<String> immutableList3 = Arrays.asList(arr); //고정된 사이즈의 리스트 return 수정만 가능함 
		System.out.println(immutableList3);
		
		
		
		
		String[] arr1 = {"A", "B", "C"};
		List<String> immutableList4 = List.of(arr1);
		System.out.println(immutableList4);
		
		Integer[] arr3 = {3,4,5}; //->미리 바꿔놔야함 
		
		
		List<Integer> list4 = Arrays.asList(arr3);
		
	}
}
