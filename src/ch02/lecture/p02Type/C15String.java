package ch02.lecture.p02Type;

public class C15String {
	public static void main(String[] args) {
		//String과 기본 타입과의 연산 
		//+외에 안됨 
		String s1 = "3";
		String s2 = "4";
//		System.out.println(s1 * s2);안됨
		// + : 연결연산 (concatenate)
		int i3 = 3;
		String s3 = "4";
		String s4 = i3 + s3;
		System.out.println(s4); //연산결과가 String 으로 뜸 
		
		System.out.println(3.14 + "Hello");
		System.out.println(false + "hi");
		String s5 = 3 + 3 + "4";
		System.out.println(s5);
		
		String s6 = "3" + 3 + 4;
		System.out.println(s6);
		
		//기본타입 -> String 주로 valueOf 썻는데 
		//연결연산 
		int i6 = 99;
		String s7 = String.valueOf(i6);
		String s8 = 99 + "";
		System.out.println(s7);
		System.out.println(s8);
		
		boolean b8 = false;
		String s9 = String.valueOf(b8);
		String s10 = b8 + "";
		System.out.println(s9);
		System.out.println(s10);
	}
}
