package ch17.lecture.p02Terminal;

import java.util.*;
import java.util.stream.*;

import javax.print.event.*;

public class C01Terminal {
	public static void main(String[] args) {
		//count 원소의 수 
		//foreach 각 원소 처리 
		//max 최대값 
		//min 최소값
		
		//findfirst 첫원소 
		//findany 아무원소 
		//allMatch 모두 일치 하는지 
		//anyMatch 하나라도 일치하는지
		//noneMatch 모두 일치하지 않는지 
		
		//reduce: 집계연산 
		//collect: 다른 collection으로 변경 
		
		String s = "abdc";
//		Map<String, Long> r2 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(e->e, Collectors.counting()));
		Object c = Arrays.stream(s.split(""))
		.collect(Collectors.groupingBy(e->e, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue() == 1)
//    	.sorted((a,b) -> a.getKey().compareTo(b.getKey()))
    	.map(e->e.getKey().toCharArray());
		
		
//				Arrays.stream(s.split(""))
//		.collect(Collectors.groupingBy(e->e, Collectors.counting()))
//		.entrySet()
//		.stream()
//		.filter(e->e.getValue() == 1)
////    	.sorted((a,b) -> a.getKey().compareTo(b.getKey()))
//    	.map(e->e.getKey().toCharArray());
			
		
		
		
	}
}
