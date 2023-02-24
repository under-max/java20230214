package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C08DeepToString {
	public static void main(String[] args) {
		int[] arr1 = { 5, 2, 1, 0 };

		System.out.println(Arrays.toString(arr1));

		int[][] arr2 = {
				{ 7, 8 },
				{ 2, 3 }
		};
		
		System.out.println(Arrays.toString(arr2));
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		
		for(int[] x : arr2) {
			System.out.println(Arrays.toString(x));
		}
		
		//deeptoString 다차원배열 확인
		System.out.println("DeepToString 메소드 사용");
		System.out.println(Arrays.deepToString(arr2));
	}
}
