package ch02.lecture.p02Type;
import java.util.Scanner;

public class C14String {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "h";
//		char c1 = (char) s2 참조타입과 기본타입간 형변환 안됨 
		String s3 = "";
		
		//문자열(String)과 기본타입간 형변환 
		//문자열을 -> 기본타입으로
		
		String str1 = "300";
		int i1 = Integer.parseInt(str1);
		
		System.out.println(i1);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		String b1 = scanner.nextLine();
		System.out.println(b1);
		
		String str2 = "900000000000000000000";
		long l2 = Long.parseLong(str2);
		System.out.println(l2);
		
		String str3 = "3.14";
		double d3 = Double.parseDouble(str3);
		System.out.println(d3);
		
		String str4 = "9.99";
		float f4 = Float.parseFloat(str4);
		System.out.println(f4);
		
		String str5 = "true";
		boolean b5 = Boolean.parseBoolean(str5);
		System.out.println(b5);
		
//		기본타입에서 문자열로 변경 
//		String.valueOf() 메소드 사용
		
		int i6 = 700;
		String str6 = String.valueOf(i6);
		
		long l7 = 9999999999L;
		String str7 = String.valueOf(l7);
		System.out.println(l7);
		
		double d8 = 3.14;
		String str8 = String.valueOf(d8);
		System.out.println(d8);
		
		boolean b9 = true;
		String str9 = String.valueOf(b9);
		System.out.println(b9);
		
		scanner.close();
	}
}
