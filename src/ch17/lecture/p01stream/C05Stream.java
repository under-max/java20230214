package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C05Stream {
	public static void main(String[] args) {
		//array -> stream
		
		String[] arr = {"java", "Spring", "jsp", "html"};
		Stream<String> stream1 = Arrays.stream(arr);
		System.out.println(stream1.count());
		
		Stream<String> stream2 = Arrays.stream(arr);
		System.out.println(stream2.max(String::compareTo).get());
	}
}
