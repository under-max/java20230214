package datastructure.array.example;

public class Example02 {
	public static void main(String[] args) {
		// 배열의 최대값과 최소값

		int[] arr = { 10, 11, 2, 5, 3, 3, 24, 15, 6, 9 };
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값: " + max + "최소값 : " + min );
	}
}
