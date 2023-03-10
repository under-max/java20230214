package ch02.sec12;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println("result1 : " + result1); // 컴파일 단계에서 계산되므로 나옴

		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2; // int 타입으로 변환되어 연산됨
		System.out.println("result2 : " + result2);

		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5; // long 타입으로 변환후 연산
		System.out.println("result3 : " + result3);

		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7; // int 타입으로 변환 후 연산

		System.out.println("result4 : " + result4);
		System.out.println("result4 : " + (char) result4); // 강제 형변환

		int v8 = 10;
		int result5 = v8 / 4;// 정수 연산의 결과는 정수 2.5가아닌 2 소수점 버려버림 
		System.out.println("result5 : " + result5);

		int v9 = 10;
		double result6 = v9 / 4.0; // double 타입으로 변환 후 연산
		System.out.println("result6 : " + result6);

		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11; // double 타입으로 변환 후 연산
		System.out.println("result7 : " + result7);
		
		int v12 = 1;
		int v13 = 2;
		double result8 = v12 / v13; //결과 0.0나옴 
		System.out.println("result8 : " + result8);
		
		float va4 = 10.132456468887453213F;
		double va5 = 10.132456468887453213;
		System.out.println(va4);
		System.out.println(va5);
		
	}
}
