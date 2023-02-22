package ch05.lecture.p01array;

public class C01Array {
	public static void main(String[] args) {
		//array 배열
//		여러값을 가진 자료 형 (data type)
//		값의 순서가 있음 
//		index 0 부터 순서 매김...(0,1,2,3,4 ....)
		
		int a; //기본 타입
		a =3;
		int[] arr1; //배열 선언 (각 값의 타입이 int인 배열 )
		arr1 = new int[3]; //아이템의 수 정의
		
		arr1[0] = 3;
		arr1[1] = 5;
		arr1[2] = 10;
		
		a = arr1[0];
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		
		System.out.println(arr1[0]);
		System.out.println(a);
		
		System.out.println("----------------");
		int max = arr1[0];
		for(int ad : arr1) {
			if(max < ad) {
				max = ad;
			}
			
			
		}
		System.out.println(max);
		
		//for 문과 궁합이 잘맞는 자료형
		int [] arr2;
		arr2 = new int[4];
		
		arr2[0] = 99;
		arr2[1] = 100;
		arr2[2] = 200;
		arr2[3] = 1000;
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
