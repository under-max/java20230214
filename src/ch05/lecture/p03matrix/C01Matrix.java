package ch05.lecture.p03matrix;

import java.net.SocketTimeoutException;

public class C01Matrix {
	//행렬
	public static void main(String[] args) {
		//2차원 배열 (행렬)
		int[][] arr = new int[3][];
		System.out.println(arr.length);
		
		arr[0] = new int[] {1,2,3,4};
		arr[1] = new int [] {2,4,8,10};
		arr[2] = new int [] {9,10,11,12};
		
		
		
		System.out.println();
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][3]);
		
		System.out.println("전체 탐색");
//for 문
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
//		for each 문
		for(int[] a : arr) {
			for(int b : a) {
				System.out.print(b + " ");
			}
			System.out.println("");
		}
		System.out.println(arr);
		System.out.println("----------------");
		System.out.println(arr[0]); //참조에 참조 2차원 배열
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		int[][] arr1 = arr;
		System.out.println("----------");
		System.out.println(arr1);
		
		for(int a : arr[0]) {
			System.out.print(a + " ");
		}
		
		
		
		
		
	}
}
