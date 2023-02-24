package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C01ToString {
	public static void main(String[] args) {
		int[] arr1 = { 19, 8, 7, 1, 2 };
		
		System.out.println(arr1[0]);
		
		
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = {"Java", "Hello", "Friday", "Sunday"};
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
