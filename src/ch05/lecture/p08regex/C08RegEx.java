package ch05.lecture.p08regex;

public class C08RegEx {
	public static void main(String[] args) {
		System.out.println("a".matches("[a-zA-Z0-9]"));
		System.out.println("2".matches("[a-zA-Z0-9]"));
		System.out.println("0".matches("[a-zA-Z0-9]"));
		
		//영문대소문자 숫자로 이루어진 3글자 인가 
		System.out.println("010".matches("[a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9]"));
		System.out.println("abc".matches("[a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9]"));
		System.out.println("aZ3".matches("[a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9]"));
	}
}
