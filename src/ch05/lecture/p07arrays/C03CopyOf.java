package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C03CopyOf {
	public static void main(String[] args) {
		int[] arr1 = { 3, 5, 9, 2, 1 };
		int[] arr2 = Arrays.copyOf(arr1, arr1.length); //파라미터 : 원본배열, 타겟 배열 길이
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1[0] = 666;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
