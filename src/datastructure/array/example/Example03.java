package datastructure.array.example;

import java.util.Arrays;

public class Example03 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 2, 3, 1 };
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < arr1.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]+ "arr1["+i+"]와" +arr2[j]+"arr2["+j+"]는"+ arr1[i]+" 로 같은 값입니다.");
				}
			}
		}
	}
}
