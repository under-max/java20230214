package ch05.sec03;

public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		int[] arr1;
		//new 가 없으면 주소값도 없음 
		int[] arr2;
	
		int[] arr3;
		
		arr1 = new int[] {1,2,3};
		System.out.println(arr1);
		arr2 = new int[] {1,2,3};
		System.out.println(arr2);
		arr3 = arr2;
		System.out.println(arr3);
		
		String b = new String();
		b = "x";
		System.out.println(b);
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
		System.out.println(arr2.equals(arr3));
		System.out.println(arr1.equals(arr2));
	}
	
	
}
