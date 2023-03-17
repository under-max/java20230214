package ch17.lecture.p02Terminal;

import java.util.*;
import java.util.stream.*;

public class C14Collect {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,5,9,10);
		
		List<Integer> list1 = list.stream().collect(Collectors.toList());
	
		
	}
}
