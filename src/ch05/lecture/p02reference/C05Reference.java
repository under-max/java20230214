package ch05.lecture.p02reference;

public class C05Reference {
	public static void main(String[] args) {
		int[] arr = {2, 4, 6};
		System.out.println(arr);
		int[] arr2 = arr;
		System.out.println(arr2);
		
		System.out.println(arr2[0]);
		System.out.println("---------------");
		arr = new int[] {2, 4, 6}; //새로운 배열 생성
		System.out.println(arr);
		System.out.println("---------------");
		System.out.println(arr[0]);
		
		System.out.println("---------------");
		System.out.println(arr2);
		
		arr[0] = 20;
		System.out.println(arr);
		System.out.println("---------------");
		System.out.println(arr[0]);
		
		System.out.println(arr2[0]);
	}
}
