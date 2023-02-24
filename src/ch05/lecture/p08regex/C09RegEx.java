package ch05.lecture.p08regex;

public class C09RegEx {
	public static void main(String[] args) {
		//character class
		//negation(not) -그 문자를 제외하고 
		
		//숫자가 아니면 일치하는 패턴 
		System.out.println("0".matches("[^0-9]"));
		System.out.println("a".matches("[^0-9]"));
		System.out.println("z".matches("[^0-9]"));
		System.out.println(" ".matches("[^0-9]"));
		System.out.println("!".matches("[^0-9]"));
		System.out.println("$".matches("[^0-9]"));
	}
}
