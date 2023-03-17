package ch17.lecture.p01stream;

import java.util.stream.*;

public class C01Stream {
	public static void main(String[] args) {
		// 여러원소를
		// 순차적 처리기능(메소드)을 제공하는 class, 또는 Interface
		//스트림 만들기 
		Stream<Integer> stream1 = Stream.of(5, 1, 3, 9, 10, 0);
		
		//스트림의 메소드(연산)
		//1.최종연산 (terminal operator)
		//리턴타입: Stream 아님
		//최종연산시 중간연산도 같이 실횅됨 
		int[] a = {1,2,3};
		
		//개수세기 (count) 
		stream1.count();
		stream1.findFirst(); //최종연산 후 재사용 불가.
		System.out.println(stream1.count());
		//2.중간연산 (Intermediate operator)
		//리턴타입: Stream
		
		
		
		
	}
}
