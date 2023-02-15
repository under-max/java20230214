package ch02.lecture.p02Type;

public class C11Conversion {
	public static void main(String[] args) {
		int i1;
		long l1;
		
		i1 = 100;
		l1 = i1; //문제없음 
		
		float f1; //4bytes
		double d1; //8bytes
		
		f1 = 3.14F;
		d1 = f1; //문제없음 
		
		//정수타입간에 작은타입 -> 큰타입 : 자동 형변환 
		//정수에서 실수로: 자동형변환 
		
		int i2;
		double d2;
		i2 = 999999;
		d2 = i2; //정수에서 실수로 자동 형변환
		
		long l2;
		l2  = 999999999999999999L;
		d2 = l2;
		
		System.out.println(d2);
		
		float f2;//4bytes
		f2 = l2;
		System.out.println(f2); //주의 근사값으로 나옴 자동형변환은 됨 
		
		//문자(char)에서 정수(int long)로 자동 형변환 
		char c3 = '가';
		int i3 = c3; //자동 형변환 (2byte -> 4byte)
		long l3 = c3; //자동 형변환 (2byte -> 8byte)
		
	}
}
