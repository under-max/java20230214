package ch05.lecture.p01array;

public class C06ArrayLength {
	public static void main(String[] args) {
		//배열의 길이
		int[] arr1 = {3,4,5,6};
		
		int len = arr1.length;
		
		for(int i = 0; i < 4; i++) {
			System.out.println(arr1[i]);
		}
		
		for (int i = 0; i < len; i++) {
			System.out.println(arr1[i]);
		}
	}
}
