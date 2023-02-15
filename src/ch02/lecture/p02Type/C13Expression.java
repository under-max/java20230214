package ch02.lecture.p02Type;

public class C13Expression {
	public static void main(String[] args) {
		//연산 중 자동 형변환 
		
		byte b1 = 30;
		byte b2 = 10;
		//byte short, char int 의 연산 결과는 int임 
		int i4 = b1 + b2;
		byte b4 = (byte) (b1 + b2);
		System.out.println(i4);
		System.out.println(b4);
		byte b5 = 30 + 10;
		System.out.println(b5);
		
		byte b6 = 127;
		byte b7 = 1;
		byte b8 = (byte) (b6 + b7);
		System.out.println(b8);
				
		//정수간의 연산에서 long이 포함된 연산의 결과는 long
		long l6 = 30;
		long l7 = 20;
	//	int i6 = l6 + l7 8바이트 짜리라 4바이트에 안들어감 
		
		int i9 = 20;
		//int i10 = i9 + l7 long 포함이라 기준이 long 이됨 
		int i10 = (int)(i9 + l7); //형변환 하면 가능
		
		//정수와 실수끼리의 연산 결과는 실수 
		int i11 = 30;
		double d11 = 3.14;
		double d12 = i11 + d11;
	}
}
