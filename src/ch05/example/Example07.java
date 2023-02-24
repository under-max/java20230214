package ch05.example;

public class Example07 {
	public static void main(String[] args) {
//최대값 출력
		int[] array = { 1, 5, 3, 8, 2 };
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		 
//		array 가 음수값일 경우 
//		int max = Integer.MIN_VALUE;
//		for(int i = 0; i < array.length; i++) {
//			if(max < array[i]) {
//				max = array[i];
//			}
//		}
		
		System.out.println(max);
		
		max = 0;
		
		for(int sd : array) {
			if(max < sd) {
				max = sd;
			}
		}
		System.out.println(max);
	}
}
