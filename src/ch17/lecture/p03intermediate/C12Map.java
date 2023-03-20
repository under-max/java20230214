package ch17.lecture.p03intermediate;

import java.util.stream.*;

public class C12Map {
	public static void main(String[] args) {
		//기본타입 int 가 원소 스트림
		IntStream stream1 = IntStream.range(11, 20);
		
		
		//
		Stream<Integer> stream2 = stream1.mapToObj(Integer::valueOf);//참조타입 스트림으로 바꿈 
		long count = stream2.count();
		
		System.out.println(count);
		
	}
}
