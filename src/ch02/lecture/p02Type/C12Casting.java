package ch02.lecture.p02Type;

public class C12Casting {
	public static void main(String[] args) {
		//정수끼리
		//casting 연산(강제형변환)
		//큰 타입에서 작은타입으로 바꾸려고 할때 강제로 해야함 
		//실수에서 정수로 (강제형변환 필요)
		
		int i1; 
		long l1;
		
		l1 = 30L;
		i1 = (int) l1; //형변환 안하면 오류
		System.out.println(i1);
		
		l1 =3000000000L;
		i1 = (int) l1;
		System.out.println(i1);
		System.out.println(l1);
		
		short s1;
		byte b1;
		
		s1 = 20000;
		b1 = (byte) s1;
		
		System.out.println(s1);
		System.out.println(b1);
		
		//실수 -> 정수 : 강제 형변환 
		double d2;
		int i2;
		
		d2 = 3.14;
		i2 = (int)d2; //강제형변환, 소수점 아래값 버려짐 소수점 아래 버리려고 종종 사용됨 
		System.out.println(d2);
		System.out.println(i2);
		
	}
}
