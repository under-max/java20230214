package ch18.example.exam10;

import java.nio.file.DirectoryStream.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class fgxc {
	public static void main(String[] args) {
		String a = "ppoottyy";
		String s = a.toLowerCase().replaceAll("[^p|y]", "");
//		System.out.println(a.replaceAll("o", "").toLowerCase());
		System.out.println(s);
//		Stream.of(a.replaceAll("o", "").toLowerCase()).sorted().toList().
		 Stream.of(a.toLowerCase().replaceAll("[^p|y]", "").split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.values().spliterator().forEachRemaining(System.out::println);
		
//		map(e-> (e+e) % 2 == 0 ? true : false).forEach(System.out::println);
				
		
		
	}
}
