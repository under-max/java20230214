package ch05.lecture.p08regex;

public class C03RegEx {
	public static void main(String[] args) {
		//character class = 문자분류
		
		System.out.println("a".matches("[abc]"));
		System.out.println("b".matches("[abc]")); //a또는 b또는 C
		System.out.println("c".matches("[abc]"));
		System.out.println("d".matches("[abc]"));
		
	}
}
