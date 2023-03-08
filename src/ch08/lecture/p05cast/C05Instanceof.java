package ch08.lecture.p05cast;

import java.io.*;
import java.lang.constant.*;

public class C05Instanceof {
	public static void main(String[] args) {
//		method("java");
//		System.out.println("==============");
//		method(new StringBuilder("java"));
		method(new StringBuffer("java"));
		
	}
	
	public static void method(CharSequence c) {
		System.out.println(c instanceof String);
		System.out.println(c instanceof Object); //t
		System.out.println(c instanceof CharSequence); //t
		System.out.println(c instanceof Comparable); //t
		System.out.println(c instanceof Serializable); //t
		System.out.println(c instanceof Constable);
		System.out.println(c instanceof ConstantDesc);
	}
}
