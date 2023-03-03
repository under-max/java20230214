package ch06.lecture.p09package;

import static java.lang.Math.*;

public class C08StaticImportAll {
	public static void main(String[] args) {
		double num1 = Math.floor(Math.random() * 6) +1;
		double num2 = Math.floor(Math.random() * 6) +1;
		
		double num3 = floor(random() * 6) +1;
		double num4 = floor(random() * 6) +1;
		
		System.out.println((int)num1);
		System.out.println((int)num2);
		
		System.out.println((int)num3);
		System.out.println((int)num4);
		
		
	}
}
