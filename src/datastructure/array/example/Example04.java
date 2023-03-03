package datastructure.array.example;

import java.util.Arrays;

public class Example04 {
	public static void main(String[] args) {
		int[] arr = { 5, 10, 9, 27, 2, 8, 10, 4, 27, 1 };
		int[] result = new int[10];
		
		//중복요소 제거 
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					result[count] = 0;
				} else if(arr[i] != arr[j]) {
					result[count] = arr[i];
				}
				
			}
			count++;
		}
		System.out.println(Arrays.toString(result));

	}
}
