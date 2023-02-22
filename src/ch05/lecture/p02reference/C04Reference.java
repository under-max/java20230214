package ch05.lecture.p02reference;

import java.lang.reflect.Method;

public class C04Reference {
	public static void main(String[] args) {
		int[] arr = {3,4,5};
		
		method(arr);
		
		System.out.println(arr[0]);
		
		method1(arr[1]);
		System.out.println(arr[1]);
	}
	
	public static void method(int[] arr2) {
		System.out.println(arr2[0]);
		
		arr2[0] = 30;
		
		System.out.println(arr2[0]);
	}
	
	public static void method1(int arr2) {
		System.out.println(arr2);
		
		arr2 = 10;
		
		System.out.println(arr2);
	}
}
