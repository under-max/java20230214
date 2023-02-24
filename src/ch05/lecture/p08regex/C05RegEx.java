package ch05.lecture.p08regex;

public class C05RegEx {
	public static void main(String[] args) {
		//Character class 
		
		System.out.println("a".matches("[abcdefghijklmnopoqrstuvwxyz]"));
		System.out.println("b".matches("[abcdefghijklmnopoqrstuvwxyz]"));
		System.out.println("c".matches("[abcdefghijklmnopoqrstuvwxyz]"));
		System.out.println("d".matches("[abcdefghijklmnopoqrstuvwxyz]"));
		
		
		System.out.println("a".matches("[a-z]"));
		System.out.println("b".matches("[a-z]"));
		System.out.println("x".matches("[a-z]"));
		System.out.println("z".matches("[a-z]"));
	}
}
