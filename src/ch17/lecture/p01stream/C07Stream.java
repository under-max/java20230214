package ch17.lecture.p01stream;

import java.util.stream.*;

public class C07Stream {
	public static void main(String[] args) {
		//IntStream 
		
		IntStream stream1 = IntStream.range(0, 10); //시작값 종료값 종료값은 포함안됨
		System.out.println(stream1.count());
		
		IntStream stream2 = IntStream.rangeClosed(0, 10); // 0 ~ 10
		System.out.println(stream2.count());
		
	}
}
