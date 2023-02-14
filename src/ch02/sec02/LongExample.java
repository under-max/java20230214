package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
		long val1 = 10;
		long val2 = 20L;
		//long val3 = 1000000000000; Java 에서 Integer 로 인식하기 때문에 Error Literal(문자 그대로의 값)
		long val3 = 1000000000000L;
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
//		2진법으로 표현하고 싶을때 
//		0B or 0b = ex) 0B1011
//		8진수
//		0으로 시작 ex)013
//		16진법
//		0x로 시작 ex) 0xB3
	}
}
