package ch12.example.ch05exam07;

public class exam07 {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 8, 2 };
		
		//Math.max 이용
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.println(max);
	}
}
