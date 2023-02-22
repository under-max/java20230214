package ch05.lecture.p02reference;

public class C02Reference {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		a = 6;
		
		System.out.println(a);
		System.out.println(b);
		
		
		int[] arr1 = {5,6,7};
		int[] arr2 = arr1; //같은 주소값 참조됨 
		double c= 10.02;
		int price = 2000;
		double o = (c / 100) * price; 
		System.out.println(o);
		int d = (int)o;
		System.out.println(d);
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		arr1[0] = 99;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
			
	}
}
