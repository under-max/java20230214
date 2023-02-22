package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] arr = new int[] {2, 4, 6};
		System.out.println(arr);
		method(arr);
		
		System.out.println(arr[0]); //2
	}
	
	public static void method(int[] arr2) {
		arr2 = new int[] {3, 5, 7};
		System.out.println(arr2);
	}
}
