package ch03.lecture.p03comparison;

public class C01Comparison {
	public static void main(String[] args) {
		//비교연산자 
		// -- ,!= ,< ,<= ,> ,>=
		
		//연산결과 boolean 
		//type 이 같은지 
		int x = 3;
		int y = 5;
		
		boolean r1 = x == y;
		System.out.println(r1);
		
		boolean r2 = x != y;
		System.out.println(r2);
		
		boolean r3 = x < y;
		System.out.println(r3);
		boolean r4 = x <= y;
		System.out.println(r4);

		boolean r5 = x > y;
		System.out.println(r5);
		
		boolean r6 = x >= y;
		System.out.println(r6);
		
		//같은 타입끼리 비교해야 함 
		
		int a = 30;
		String b = "50";
		boolean c = true;
//		boolean r7 = a < b; 다른타입 비교 불가
//				실수끼리는 가능
//				하지만 타입을 맞춘 후 비교 
		
		int num1 = 30;
		double num2 = 30.0;
		boolean r9 = num1 == num2; 
		System.out.println(r9); //true
		
		
	}
}
