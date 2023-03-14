package ch15.example.exam0507;

import java.util.*;

public class Exam0507 {
	public static void main(String[] args) {
//		int[] array = { 1, 5, 3, 8, 2 };
//		List<Integer> list = new ArrayList<>(); //수정가능
		List<Integer> list = List.of(1, 5, 3, 8, 2); // 수정 불가 리스트 리턴
		
		//위 리스트에서 최대값 구하는 코드 작성 
		
		int max = list.get(0);
		for(Integer a : list) {
			if(max < a) {
				max = a;
			}
		}
		
		System.out.println(max);

	}
}
