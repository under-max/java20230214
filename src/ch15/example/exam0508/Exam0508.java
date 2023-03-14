package ch15.example.exam0508;

import java.util.*;

public class Exam0508 {
	public static void main(String[] args) {
		List<List<Integer>> list = List.of(
				List.of(95,86),
				List.of(83,92,96),
				List.of(78,83,93,87,88));
		
		
		
		//문제6 
		System.out.println(list.size()); //3
		System.out.println(list.get(2).size()); //5
		
		// 문제 8
		// 합, 평균 구하기
		
		int sum = 0;
		int counter = 0;
		for(List<Integer> a: list) {
			for(Integer b: a) {
				sum += b;
				counter += 1;
			}
		}
		
		list.forEach(s -> s.forEach(a->System.out.println(a)));
		
		list.forEach(b -> b.forEach(System.out::println));
		
		
		System.out.println("합계" + sum);
		
		System.out.println("평균 : " +  (sum / counter));
		
		
		
	}
}
