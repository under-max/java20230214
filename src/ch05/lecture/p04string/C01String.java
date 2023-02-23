package ch05.lecture.p04string;

import java.util.Arrays;

public class C01String {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = str2;
		
		System.out.println(str1 == str2); //false
		System.out.println(str2 == str3); //true
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		System.out.println(Arrays.equals(arr1, arr2)); 
		System.out.println(arr1.equals(arr2));
		
		String b = String.valueOf("Hello"); 
		String c = "Hello";
		
		System.out.println(b == c);
		

		
		
		
	}
}
