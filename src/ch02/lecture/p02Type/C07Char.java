package ch02.lecture.p02Type;

public class C07Char {
	public static void main(String[] args) {
		//char (문자) 2bytes -> 16bits 
//		하나의 문자값 저장 
//		0~65535(unicode 표 사용)
		
		char c1 = 65261;
		System.out.println(c1);
		
		char c2 = 8594;
		System.out.println(c2);
		
		char c3 = '\u53f8';
		System.out.println(c3);
		
		char c4 = 'a';
		System.out.println(c4);
		
		char c5 = '가';
		System.out.println(c5);
		
//		char c6 = 'ab';
//		System.out.println(c6); 문자 2개이므로 Error
		
//		char c7 = '';
//		System.out.println(c7); 빈공란이므로 Error
		
		char c8 = 'b';
		int d = c8 - c4;
		System.out.println(d);
		
	}
}
